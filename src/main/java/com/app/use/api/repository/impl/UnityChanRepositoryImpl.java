package com.app.use.api.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.use.api.repository.UnityChanRepository;
import com.app.use.entity.extension.UserProfile;
import com.app.use.infrastructure.dao.extension.UserProfileDao;

@Repository
public class UnityChanRepositoryImpl implements UnityChanRepository {

	@Autowired
	private UserProfileDao userProfileDao;

	@Override
	public UserProfile findUserProfile(String id) {
		UserProfile userProfile = userProfileDao.findById(id);

		if (userProfile == null) {
			return null;
		}
		return userProfile;
	}
}
