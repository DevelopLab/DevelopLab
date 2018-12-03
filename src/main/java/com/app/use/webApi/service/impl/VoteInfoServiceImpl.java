package com.app.use.webApi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.common.dto.VoteInfoDto;
import com.app.use.entity.Vote;
import com.app.use.entity.VoteInfo;
import com.app.use.entity.VoteInfoUser;
import com.app.use.webApi.form.VoteInfoForm;
import com.app.use.webApi.repository.VoteInfoRepository;
import com.app.use.webApi.service.VoteInfoService;

@Service
public class VoteInfoServiceImpl implements VoteInfoService {

	@Autowired
	private VoteInfoRepository voteInfoRepository;

	@Override
	public VoteInfoDto getVoteInfo(Date nowDate) {
		List<Vote> voteList = voteInfoRepository.findVote(nowDate);
		if (voteList.size() <= 0) {
			return null;
		}

		Vote vote = voteList.get(0);
		VoteInfo voteInfo = new VoteInfo();
		voteInfo.setVoteId(vote.getVoteId());
		List<VoteInfo> voteInfoList = voteInfoRepository.findVoteInfo(voteInfo);
		if (voteInfoList.size() <= 0) {
			return null;
		}

		return new VoteInfoDto(vote, voteInfoList);
	}

	@Override
	public boolean registerVoteInfo(VoteInfoForm voteInfoForm) {
		VoteInfoUser voteInfoUser = new VoteInfoUser();
		voteInfoUser.setVoteId(voteInfoForm.getVote_id());
		voteInfoUser.setUserName(voteInfoForm.getUser_name());
		voteInfoUser.setVoteNumber(voteInfoForm.getVote_number());
		voteInfoUser.setUserAgent(voteInfoForm.getUser_agent());
		voteInfoRepository.registerVoteInfoUser(voteInfoUser);
		return true;
	}

	@Override
	public List<VoteInfoUser> getResultVoteInfo(VoteInfo voteInfo) {
		VoteInfoUser voteInfoUser = new VoteInfoUser();
		voteInfoUser.setVoteId(voteInfo.getVoteId());
		voteInfoUser.setVoteNumber(voteInfo.getVoteNumber());
		List<VoteInfoUser> voteInfoUserList = voteInfoRepository.findVoteInfoUser(voteInfoUser);

		return voteInfoUserList;
	}

}
