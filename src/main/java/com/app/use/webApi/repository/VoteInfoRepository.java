package com.app.use.webApi.repository;

import java.util.Date;
import java.util.List;

import com.app.use.entity.Vote;
import com.app.use.entity.VoteInfo;
import com.app.use.entity.VoteInfoUser;

public interface VoteInfoRepository {

	List<Vote> findVote(Date nowDate);

	Vote findIdVote(Vote vote);

	boolean register(Vote vote);

	List<VoteInfo> findVoteInfo(VoteInfo voteInfo);

	VoteInfo findIdVoteInfo(VoteInfo voteInfo);

	void registerVoteInfoUser(VoteInfoUser voteInfoUser);

	List<VoteInfoUser> findVoteInfoUser(VoteInfoUser voteInfoUser);
}
