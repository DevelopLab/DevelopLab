package com.app.use.entity;

import java.io.Serializable;
import java.util.Date;

public class MobileApp implements Serializable {

	private static final long serialVersionUID = -6299142562947405479L;

	private int app_id;

	private String app_name;

	private String app_icon;

	private String ios_app_url;

	private String android_app_url;

	private String comment;

	private Date create_date;

	private Date update_date;

	public int getAppId() {
		return app_id;
	}

	public void setAppId(int app_id) {
		this.app_id = app_id;
	}

	public String getAppName() {
		return app_name;
	}

	public void setAppName(String app_name) {
		this.app_name = app_name;
	}

	public String getAppIcon() {
		return app_icon;
	}

	public void setAppIcon(String app_icon) {
		this.app_icon = app_icon;
	}

	/**
	 * @return ios_app_url
	 */
	public String getIosAppUrl() {
		return ios_app_url;
	}

	/**
	 * @param ios_app_url セットする ios_app_url
	 */
	public void setIosAppUrl(String ios_app_url) {
		this.ios_app_url = ios_app_url;
	}

	/**
	 * @return android_app_url
	 */
	public String getAndroidAppUrl() {
		return android_app_url;
	}

	/**
	 * @param android_app_url セットする android_app_url
	 */
	public void setAndroidAppUrl(String android_app_url) {
		this.android_app_url = android_app_url;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreateDate() {
		return create_date;
	}

	public void setCreateDate(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdateDate() {
		return update_date;
	}

	public void setUpdateDate(Date update_date) {
		this.update_date = update_date;
	}
}
