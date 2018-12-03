package com.app.use.webApi.repository;

import com.app.use.entity.User;

public interface LoginRepository {

	User authenticate(String id);
}
