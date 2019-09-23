package com.app.use.webApi.repository;

import com.app.use.entity.extension.UserProfile;
import com.app.use.webApi.form.UserProfileForm;

public interface UserProfileRepository {

	UserProfile getUserProfile(String userId);

	boolean updateUserProfile(UserProfileForm userProfileForm);

	boolean updateIosUdid(String userId, String udid);
}
