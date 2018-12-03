package com.app.use.webApi.service;

import com.app.use.webApi.form.LoginForm;

public interface LoginService {

	boolean authenticate(LoginForm loginForm);

	boolean forDeveloperAuthenticate(LoginForm loginForm);

	boolean forAdminAuthenticate(LoginForm loginForm);
}
