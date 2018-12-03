package com.app.use.entity;

import java.io.Serializable;
import java.util.Date;

public class Vote implements Serializable {

	private static final long serialVersionUID = -4313145341521277586L;

	private int vote_id;

	private String title;

	private String comment;

	private String image_icon;

	private Date deadline_date;

	private Date vote_start_date;

	private Date vote_end_date;

	private Date create_date;

	private Date update_date;

	public int getVoteId() {
		return vote_id;
	}

	public void setVoteId(int vote_id) {
		this.vote_id = vote_id;
	}

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
		return image_icon;
	}

	public void setImageIcon(String image_icon) {
		this.image_icon = image_icon;
	}

	public Date getDeadlineDate() {
		return deadline_date;
	}

	public void setDeadlineDate(Date deadline_date) {
		this.deadline_date = deadline_date;
	}

	public Date getVoteStartDate() {
		return vote_start_date;
	}

	public void setVoteStartDate(Date vote_start_date) {
		this.vote_start_date = vote_start_date;
	}

	public Date getVoteEndSate() {
		return vote_end_date;
	}

	public void setVoteEndDate(Date vote_end_date) {
		this.vote_end_date = vote_end_date;
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
