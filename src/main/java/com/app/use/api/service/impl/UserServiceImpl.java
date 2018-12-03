package com.app.use.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.api.json.UserJson;
import com.app.use.api.service.UserService;
import com.app.use.entity.User;
import com.app.use.webApi.repository.LoginRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public UserJson authenticate(UserJson userJson) {

		// ユーザIDからユーザの情報を取得
		User user = loginRepository.authenticate(userJson.getId());
		if (user == null) {
			userJson.setResultCode("L00");
			userJson.setErrorMessage("入力されたユーザは存在しません。");
		} else if (!user.getPassword().equals(userJson.getPassword())) {
			userJson.setResultCode("L00");
			userJson.setErrorMessage("IDまたは、パスワードが正しくありません。");
		} else {
			userJson.setResultCode("N00");
		}

		return userJson;
	}
}
