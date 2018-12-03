package com.app.use.webApi.repository;

import java.util.List;

import com.app.use.entity.MobileApp;

public interface MobileAppRepository {

	List<MobileApp> findAll();
}
