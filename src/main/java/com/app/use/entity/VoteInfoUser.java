package com.app.use.entity;

import java.io.Serializable;
import java.util.Date;

public class VoteInfoUser implements Serializable {

	private static final long serialVersionUID = -8027675694112178347L;

	private int vote_id;

	private int vote_detail_id;

	private int vote_number;

	private String user_name;

	private String user_agent;

	private Date create_date;

	private Date update_date;
	/**
	 * @return vote_id
	 */
	public int getVoteId() {
		return vote_id;
	}
	/**
	 * @param vote_id セットする vote_id
	 */
	public void setVoteId(int vote_id) {
		this.vote_id = vote_id;
	}
	/**
	 * @return vote_detail_id
	 */
	public int getVoteDetailId() {
		return vote_detail_id;
	}
	/**
	 * @param vote_detail_id セットする vote_detail_id
	 */
	public void setVoteDetailId(int vote_detail_id) {
		this.vote_detail_id = vote_detail_id;
	}
	/**
	 * @return vote_number
	 */
	public int getVoteNumber() {
		return vote_number;
	}
	/**
	 * @param vote_number セットする vote_number
	 */
	public void setVoteNumber(int vote_number) {
		this.vote_number = vote_number;
	}

	/**
	 * @return user_name
	 */
	public String getUserName() {
		return user_name;
	}

	/**
	 * @param user_name セットする user_name
	 */
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return user_agent
	 */
	public String getUserAgent() {
		return user_agent;
	}
	/**
	 * @param user_agent セットする user_agent
	 */
	public void setUserAgent(String user_agent) {
		this.user_agent = user_agent;
	}
	/**
	 * @return create_date
	 */
	public Date getCreateDate() {
		return create_date;
	}
	/**
	 * @param create_date セットする create_date
	 */
	public void setCreateDate(Date create_date) {
		this.create_date = create_date;
	}
	/**
	 * @return update_date
	 */
	public Date getUpdateDate() {
		return update_date;
	}
	/**
	 * @param update_date セットする update_date
	 */
	public void setUpdateDate(Date update_date) {
		this.update_date = update_date;
	}
}
