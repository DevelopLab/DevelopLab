package com.app.use.infrastructure.dao;

import com.app.use.entity.User;

public interface UserDao {

	public User findById(String id);

	public void update(User user);

	public int updateIosUdid(User user);
}
