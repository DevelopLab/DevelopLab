package com.app.use.common.type;

public enum SexType {
	M("M", "ノーマルM"),
	S("S", "ノーマルS"),
	DM("DM", "ドM"),
	DS("DS", "ドS"),;

    private final String key;
    private final String value;

    private SexType(String key, String value) {
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
