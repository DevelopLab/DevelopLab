package com.app.use.webApi.repository.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.use.entity.Vote;
import com.app.use.entity.VoteInfo;
import com.app.use.entity.VoteInfoUser;
import com.app.use.infrastructure.dao.VoteDao;
import com.app.use.infrastructure.dao.VoteInfoDao;
import com.app.use.infrastructure.dao.VoteInfoUserDao;
import com.app.use.webApi.repository.VoteInfoRepository;

@Repository
public class VoteInfoRepositoryImpl implements VoteInfoRepository {

	@Autowired
	private VoteDao voteDao;

	@Autowired
	private VoteInfoDao voteInfoDao;

	@Autowired
	private VoteInfoUserDao voteInfoUserDao;

	@Override
	public List<Vote> findVote(Date nowDate) {
		List<Vote> voteList = voteDao.findVote(nowDate);
		return voteList;
	}

	@Override
	public Vote findIdVote(Vote vote) {
		vote = voteDao.findIdVote(vote);
		return vote;
	}

	@Override
	public boolean register(Vote vote) {
		boolean result = voteDao.insert(vote);
		return result;
	}

	@Override
	public List<VoteInfo> findVoteInfo(VoteInfo voteInfo) {
		List<VoteInfo> voteInfoList = voteInfoDao.findVoteId(voteInfo);
		return voteInfoList;
	}

	@Override
	public void registerVoteInfoUser(VoteInfoUser voteInfoUser) {

		voteInfoUserDao.insert(voteInfoUser);
	}

	@Override
	public VoteInfo findIdVoteInfo(VoteInfo voteInfo) {
		voteInfo = voteInfoDao.findIdVoteInfo(voteInfo);
		return voteInfo;
	}

	@Override
	public List<VoteInfoUser> findVoteInfoUser(VoteInfoUser voteInfoUser) {
		List<VoteInfoUser> voteInfoUserList = voteInfoUserDao.findVoteInfoUser(voteInfoUser);
		return voteInfoUserList;
	}
}
