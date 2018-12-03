package com.app.use.webApi.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.use.entity.User;
import com.app.use.infrastructure.dao.UserDao;
import com.app.use.webApi.repository.LoginRepository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@Autowired
	private UserDao userDao;

	@Override
	public User authenticate(String id) {

		User user = userDao.findById(id);
		return user;
	}
}
