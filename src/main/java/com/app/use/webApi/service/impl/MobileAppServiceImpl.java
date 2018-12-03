package com.app.use.webApi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.entity.MobileApp;
import com.app.use.webApi.repository.MobileAppRepository;
import com.app.use.webApi.repository.UserProfileRepository;
import com.app.use.webApi.service.MobileAppService;

@Service
public class MobileAppServiceImpl implements MobileAppService {

	@Autowired
	private MobileAppRepository mobileAppRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public List<MobileApp> getMobileAppInfo() {
		List<MobileApp> mobileAppList = mobileAppRepository.findAll();
		return mobileAppList;
	}

	@Override
	public boolean updateIosUdid(String userId, String udid) {
		return userProfileRepository.updateIosUdid(userId, udid);
	}
}
