package com.app.use.api.service.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.api.json.UnityChanJson;
import com.app.use.api.json.UserJson;
import com.app.use.api.repository.UnityChanRepository;
import com.app.use.api.service.UnityChanService;
import com.app.use.common.message.Greeter;
import com.app.use.common.message.UnityChanUnderstanding;
import com.app.use.entity.extension.UserProfile;

@Service
public class UnityChanServiceImpl implements UnityChanService {

	@Autowired
	private UnityChanRepository unityChanRepository;

	@Autowired
	private UnityChanUnderstanding unityChanUnderstanding;

	@Override
	public UnityChanJson nowTimeGreeting(String loginId) {

		UserProfile userProfile = unityChanRepository.findUserProfile(loginId);
		UnityChanJson unityChanEntity = new UnityChanJson();
		Greeter greeter = new Greeter();
		unityChanEntity.setMessage(greeter.getGreeterMessage(Calendar.getInstance(), userProfile));
		unityChanEntity.setResultCode("N00");
		unityChanEntity.setEmotion("Greeting");
		return unityChanEntity;
	}

	@Override
	public UnityChanJson conversation(UserJson userRequest) {
		UnityChanJson unityChanEntity = unityChanUnderstanding.userInputUnderstanding(userRequest.getMessage());
		return unityChanEntity;
	}
}
