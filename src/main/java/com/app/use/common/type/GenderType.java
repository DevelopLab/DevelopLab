package com.app.use.common.type;

/**
 * 性別
 *
 * @author M.hiraishi
 */
public enum GenderType {
	MALE("MALE", "男性"),
	FEMALE("FEMALE", "女性"),
	NEUTRAL("NEUTRAL", "中性");

    private final String key;
    private final String value;

    private GenderType(String key, String value) {
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
