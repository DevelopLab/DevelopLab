package com.app.use.common.type;

/**
 * 権限
 *
 * @author M.hiraishi
 */
public enum AuthorityType {
	ADMIN("ADMIN", "管理者"),
	DEVELOPER("DEVELOPER", "開発者"),
	USER("USER", "ユーザ");

    private final String key;
    private final String value;

    private AuthorityType(String key, String value) {
    	this.key = key;
    	this.value = value;
    }

	public String getKye() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
