package com.app.use.api.json;

import java.io.Serializable;

public class UserJson implements Serializable {

	private static final long serialVersionUID = 1006087642914921605L;

	private String id;
	private String password;
	private String message;
	private String resultCode;
	private String errorMessage;

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getId() {
		return this.id;
	}

	public String getPassword() {
		return this.password;
	}

	public String getMessage() {
		return this.message;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
}
