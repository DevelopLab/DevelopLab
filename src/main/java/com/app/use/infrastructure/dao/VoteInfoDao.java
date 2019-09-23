package com.app.use.infrastructure.dao;

import java.util.List;

import com.app.use.entity.VoteInfo;

public interface VoteInfoDao {

	List<VoteInfo> findVoteId(VoteInfo voteInfo);

	VoteInfo findIdVoteInfo(VoteInfo voteInfo);
}
