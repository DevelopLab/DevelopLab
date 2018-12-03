package com.app.use.webApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.common.util.StringUtil;
import com.app.use.entity.extension.UserProfile;
import com.app.use.webApi.form.UserProfileForm;
import com.app.use.webApi.repository.UserProfileRepository;
import com.app.use.webApi.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public boolean getUserProfile(String userId, UserProfileForm userProfileForm) {

		UserProfile userProfile = userProfileRepository.getUserProfile(userId);
		if (userProfile == null) {
			return false;
		}
		userProfileForm.setId(userId);
		userProfileForm.setName(userProfile.getName());
		userProfileForm.setImageIcon(userProfile.getImageIcon());
		userProfileForm.setAge(userProfile.getAge());
		userProfileForm.setBirthday(StringUtil.dayFormat(userProfile.getBirthday()));
		userProfileForm.setGender(userProfile.getGender());
		userProfileForm.setSex(userProfile.getSex());
		return true;
	}

	@Override
	public boolean updateProfile(UserProfileForm userProfileForm) {
		return userProfileRepository.updateUserProfile(userProfileForm);
	}
}
