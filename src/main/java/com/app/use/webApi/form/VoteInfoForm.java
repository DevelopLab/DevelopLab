package com.app.use.webApi.form;

import java.io.Serializable;

public class VoteInfoForm implements Serializable {

	private static final long serialVersionUID = 3862443179051924468L;

	private int vote_id;
	private int vote_number;
	private String user_name;
	private String user_agent;

	public int getVote_id() {
		return vote_id;
	}

	public void setVote_id(int vote_id) {
		this.vote_id = vote_id;
	}

	public int getVote_number() {
		return vote_number;
	}

	public void setVote_number(int vote_number) {
		this.vote_number = vote_number;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_agent() {
		return user_agent;
	}

	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}
}
