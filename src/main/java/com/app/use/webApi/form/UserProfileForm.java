package com.app.use.webApi.form;

import java.io.Serializable;

import com.app.use.common.type.GenderType;
import com.app.use.common.type.SexType;

public class UserProfileForm implements Serializable {

	private static final long serialVersionUID = 9158359980822433394L;

	private String id;

	private String name;

	private GenderType gender;

	private int age;

	private String birthday;

	private SexType sex;

	private String imageIcon;

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

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
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

	public SexType getSex() {
		return sex;
	}

	public void setSex(SexType sex) {
		this.sex = sex;
	}

	public String getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}
}
