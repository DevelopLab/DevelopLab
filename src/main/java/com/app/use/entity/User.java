package com.app.use.entity;

import java.io.Serializable;
import java.sql.Date;

import com.app.use.common.type.AuthorityType;

public class User implements Serializable {

	private static final long serialVersionUID = 6730818530334202018L;

	private String id;
	private String name;
	private String password;
	private AuthorityType authority;
	private String ios_udid;
	private String image_icon;
	private int error_count;
	private Date createDate;
	private Date updateDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthorityType getAuthority() {
		return authority;
	}

	public void setAuthority(AuthorityType authorityType) {
		this.authority = authorityType;
	}

	public String getIosUdid() {
		return ios_udid;
	}

	public void setIosUdid(String ios_udid) {
		this.ios_udid = ios_udid;
	}

	public String getImageIcon() {
		return image_icon;
	}

	public void setImageIcon(String image_icon) {
		this.image_icon = image_icon;
	}

	public int getErrorCount() {
		return error_count;
	}

	public void setErrorCount(int error_count) {
		this.error_count = error_count;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
