package com.app.use.api.service;

import com.app.use.api.json.UserJson;

public interface UserService {

	public UserJson authenticate(UserJson userJson);
}
