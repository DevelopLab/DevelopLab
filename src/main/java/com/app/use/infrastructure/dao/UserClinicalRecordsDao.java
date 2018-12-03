package com.app.use.infrastructure.dao;

import com.app.use.entity.UserClinicalRecords;

public interface UserClinicalRecordsDao {

	public UserClinicalRecords findById(String id);

	public void update(UserClinicalRecords userClinicalRecords);
}
