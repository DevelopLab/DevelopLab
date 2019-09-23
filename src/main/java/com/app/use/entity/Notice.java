package com.app.use.entity;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {

	private static final long serialVersionUID = -3844688311014329842L;

	private int id;
	private String title;
	private String noticeInfo;
	private String noticeDay;
	private Date createDate;
	private Date updateDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getNoticeInfo() {
		return noticeInfo;
	}
	public void setNoticeInfo(String noticeInfo) {
		this.noticeInfo = noticeInfo;
	}

	public String getNoticeDay() {
		return noticeDay;
	}
	public void setNoticeDay(String noticeDay) {
		this.noticeDay = noticeDay;
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
