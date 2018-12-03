package com.app.use.api.service;

import com.app.use.api.json.UnityChanJson;
import com.app.use.api.json.UserJson;

public interface UnityChanService {

	public UnityChanJson nowTimeGreeting(String loginId);

	public UnityChanJson conversation(UserJson userRequest);
}
