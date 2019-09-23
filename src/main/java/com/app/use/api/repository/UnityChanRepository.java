package com.app.use.api.repository;

import com.app.use.entity.extension.UserProfile;

public interface UnityChanRepository {

	public UserProfile findUserProfile(String id);
}
