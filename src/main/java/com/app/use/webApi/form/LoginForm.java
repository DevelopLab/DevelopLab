package com.app.use.webApi.form;

import com.app.use.common.type.AuthorityType;

public class LoginForm {

	private String id;

	private String name;

	private String password;

	private AuthorityType authority;

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return this.password;
	}

	public AuthorityType getAuthority() {
		return authority;
	}

	public void setAuthority(AuthorityType authority) {
		this.authority = authority;
	}
}
