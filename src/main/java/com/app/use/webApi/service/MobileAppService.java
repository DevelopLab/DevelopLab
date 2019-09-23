package com.app.use.webApi.service;

import java.util.List;

import com.app.use.entity.MobileApp;

public interface MobileAppService {

	public List<MobileApp> getMobileAppInfo();

	boolean updateIosUdid(String userId, String udid);
}
