package com.app.use.webApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.common.type.AuthorityType;
import com.app.use.entity.User;
import com.app.use.webApi.form.LoginForm;
import com.app.use.webApi.repository.LoginRepository;
import com.app.use.webApi.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public boolean authenticate(LoginForm loginForm) {

		// ユーザIDからユーザの情報を取得
		User user = loginRepository.authenticate(loginForm.getId());

		// 存在しないユーザIDの場合
		if (user == null) {
			return false;
		}
		// 入力したパスワードが一致しない場合
		if (!loginForm.getPassword().equals(user.getPassword())) {
			return false;
		}

		this.setForm(loginForm, user);
		return true;
	}

	@Override
	public boolean forDeveloperAuthenticate(LoginForm loginForm) {
		// ユーザIDからユーザの情報を取得
		User user = loginRepository.authenticate(loginForm.getId());

		// 存在しないユーザIDの場合
		if (user == null) {
			return false;
		}
		// 入力したパスワードが一致しない場合
		if (!loginForm.getPassword().equals(user.getPassword())) {
			return false;
		}

		// ユーザ権限の場合
		if (AuthorityType.USER.equals(user.getAuthority())) {
			return false;
		}

		this.setForm(loginForm, user);
		return true;
	}

	@Override
	public boolean forAdminAuthenticate(LoginForm loginForm) {
		// ユーザIDからユーザの情報を取得
		User user = loginRepository.authenticate(loginForm.getId());

		// 存在しないユーザIDの場合
		if (user == null) {
			return false;
		}
		// 入力したパスワードが一致しない場合
		if (!loginForm.getPassword().equals(user.getPassword())) {
			return false;
		}

		// ユーザ権限の場合
		if (!AuthorityType.ADMIN.equals(user.getAuthority())) {
			return false;
		}

		this.setForm(loginForm, user);
		return true;
	}

	private void setForm(LoginForm loginForm, User user) {
		// ユーザ名を設定
		loginForm.setName(user.getName());
		// ユーザ権限を設定
		loginForm.setAuthority(user.getAuthority());
	}
}
