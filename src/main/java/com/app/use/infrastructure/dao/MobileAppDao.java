package com.app.use.infrastructure.dao;

import java.util.List;

import com.app.use.entity.MobileApp;

public interface MobileAppDao {

	public List<MobileApp> findAll();
}
