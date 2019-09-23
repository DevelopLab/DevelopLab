package com.app.use.common.dto;

import java.io.Serializable;
import java.util.List;

import com.app.use.entity.VoteInfo;
import com.app.use.entity.VoteInfoUser;

public class ResultVoteInfoDto implements Serializable  {

	private static final long serialVersionUID = 2280166891185657229L;

	private VoteInfo voteInfo;

	private List<VoteInfoUser> voteInfoUserList;

	public ResultVoteInfoDto(VoteInfo voteInfo, List<VoteInfoUser> voteInfoUserList) {
		this.voteInfo = voteInfo;
		this.voteInfoUserList = voteInfoUserList;
	}

	public VoteInfo getVoteInfo() {
		return voteInfo;
	}

	public void setVoteInfoList(VoteInfo voteInfo) {
		this.voteInfo = voteInfo;
	}

	public List<VoteInfoUser> getVoteInfoUserList() {
		return voteInfoUserList;
	}

	public void setVoteInfoUserList(List<VoteInfoUser> voteInfoUserList) {
		this.voteInfoUserList = voteInfoUserList;
	}
}
