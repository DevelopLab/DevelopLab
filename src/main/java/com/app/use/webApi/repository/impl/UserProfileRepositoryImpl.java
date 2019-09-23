package com.app.use.webApi.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.use.common.util.StringUtil;
import com.app.use.entity.User;
import com.app.use.entity.UserClinicalRecords;
import com.app.use.entity.extension.UserProfile;
import com.app.use.infrastructure.dao.UserClinicalRecordsDao;
import com.app.use.infrastructure.dao.UserDao;
import com.app.use.infrastructure.dao.extension.UserProfileDao;
import com.app.use.webApi.form.UserProfileForm;
import com.app.use.webApi.repository.UserProfileRepository;

@Repository
public class UserProfileRepositoryImpl implements UserProfileRepository {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserProfileDao userProfileDao;

	@Autowired
	private UserClinicalRecordsDao userClinicalRecordsDao;

	@Override
	public UserProfile getUserProfile(String userId) {
		UserProfile userProfile = userProfileDao.findById(userId);
		return userProfile;
	}

	@Override
	public boolean updateUserProfile(UserProfileForm userProfileForm) {

		User user = new User();
		user.setId(userProfileForm.getId());
		// TODO 今後実装予定...予定は未定( ´▽｀)
//		user.setName(userProfileForm.getName());
//		user.setImageIcon(userProfileForm.getBirthday());
		this.userDao.update(user);

		UserClinicalRecords userClinicalRecords = new UserClinicalRecords();
		userClinicalRecords.setId(userProfileForm.getId());
		userClinicalRecords.setGender(userProfileForm.getGender().getKey());
		userClinicalRecords.setAge(userProfileForm.getAge());
		userClinicalRecords.setBirthday(StringUtil.dayParse(userProfileForm.getBirthday()));
		userClinicalRecords.setSex(userProfileForm.getSex().getKey());
		this.userClinicalRecordsDao.update(userClinicalRecords);
		return true;
	}

	@Override
	public boolean updateIosUdid(String userId, String udid) {
		User user = new User();
		user.setId(userId);
		user.setIosUdid(udid);

		int result = userDao.updateIosUdid(user);
		if (result <= 0) {
			return false;
		}

		return true;
	}
}
