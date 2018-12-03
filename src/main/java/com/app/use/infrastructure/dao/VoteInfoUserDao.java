package com.app.use.infrastructure.dao;

import java.util.List;

import com.app.use.entity.VoteInfoUser;

public interface VoteInfoUserDao {

	List<VoteInfoUser> findVoteInfoUser(VoteInfoUser voteInfoUser);

	void insert(VoteInfoUser voteInfoUser);
}
