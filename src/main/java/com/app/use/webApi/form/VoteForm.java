package com.app.use.webApi.form;

import java.io.Serializable;

import org.springframework.lang.NonNull;

public class VoteForm implements Serializable {

	private static final long serialVersionUID = 8452041748471342720L;

	@NonNull
	private String title;

	@NonNull
	private String comment;

	private String imageIcon;

	@NonNull
	private String deadlineDate;

	@NonNull
	private String startDate;

	@NonNull
	private String endDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}

	public String getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(String deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
