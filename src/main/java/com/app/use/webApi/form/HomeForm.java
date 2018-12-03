package com.app.use.webApi.form;

import java.io.Serializable;

public class HomeForm implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = -3147370534900886671L;

	private String name;

	private String imageIcon;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}
}
