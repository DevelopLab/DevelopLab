package com.app.use.infrastructure.dao;

import java.util.Date;
import java.util.List;

import com.app.use.entity.Vote;

public interface VoteDao {

	List<Vote> findVote(Date nowDate);

	Vote findIdVote(Vote vote);
}
