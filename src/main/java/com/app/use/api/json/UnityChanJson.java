package com.app.use.api.json;

import java.io.Serializable;

public class UnityChanJson implements Serializable {

	private static final long serialVersionUID = 1L;

	private String[] message;

	private String emotion;

	private String resultCode;

	private String[] errorMessage;

	public void setMessage(String[] message) {
		this.message = message;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public void setErrorMessage(String[] errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String[] getMessage() {
		return this.message;
	}

	public String getEmotion() {
		return this.emotion;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public String[] getErrorMessage() {
		return this.errorMessage;
	}
}
