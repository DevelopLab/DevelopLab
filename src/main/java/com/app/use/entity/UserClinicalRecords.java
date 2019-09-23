package com.app.use.entity;

import java.io.Serializable;
import java.util.Date;

public class UserClinicalRecords implements Serializable {

	private static final long serialVersionUID = -5811491358982265298L;

	private String id;
	private String gender;
	private int age;
	private String birthday;
	private String sex;
	private String personality;
	private String intimacy;
	private String psychopath;
	private Date createDate;
	private Date updateDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getIntimacy() {
		return intimacy;
	}

	public void setIntimacy(String intimacy) {
		this.intimacy = intimacy;
	}

	public String getPsychopath() {
		return psychopath;
	}

	public void setPsychopath(String psychopath) {
		this.psychopath = psychopath;
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
