package com.app.use.webApi.service;

import com.app.use.webApi.form.UserProfileForm;

public interface UserProfileService {

	boolean getUserProfile(String userId, UserProfileForm userProfileForm);

	boolean updateProfile(UserProfileForm userProfileForm);
}
