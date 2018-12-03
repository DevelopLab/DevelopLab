package com.app.use.infrastructure.dao.extension;

import org.mybatis.spring.annotation.MapperScan;

import com.app.use.entity.extension.UserProfile;

@MapperScan
public interface UserProfileDao {

	public UserProfile findById(String id);
}
