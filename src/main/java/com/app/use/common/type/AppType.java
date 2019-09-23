package com.app.use.common.type;

public enum AppType {
	IOS("IOS", "ios"),
	ANDROID("ANDROID", "android");

    private final String key;

    private final String value;

    private AppType(String key, String value) {
    	this.key = key;
    	this.value = value;
    }

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
