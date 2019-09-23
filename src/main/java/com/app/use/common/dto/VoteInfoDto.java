package com.app.use.common.dto;

import java.io.Serializable;
import java.util.List;

import com.app.use.entity.Vote;
import com.app.use.entity.VoteInfo;

public class VoteInfoDto implements Serializable {

	private static final long serialVersionUID = 1900334096687189185L;

	private final Vote vote;

	private final List<VoteInfo> voteInfoList;

	public VoteInfoDto(Vote vote, List<VoteInfo> voteInfoList) {
		this.vote = vote;
		this.voteInfoList = voteInfoList;
	}

	public Vote getVote() {
		return vote;
	}

	public List<VoteInfo> getVoteInfoList() {
		return voteInfoList;
	}
}
