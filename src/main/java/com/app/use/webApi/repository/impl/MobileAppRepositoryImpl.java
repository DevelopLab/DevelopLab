package com.app.use.webApi.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.use.entity.MobileApp;
import com.app.use.infrastructure.dao.MobileAppDao;
import com.app.use.webApi.repository.MobileAppRepository;

@Repository
public class MobileAppRepositoryImpl implements MobileAppRepository {

	@Autowired
	private MobileAppDao mobileAppDao;

	@Override
	public List<MobileApp> findAll() {
		List<MobileApp> mobileAppList = mobileAppDao.findAll();
		return mobileAppList;
	}

}
