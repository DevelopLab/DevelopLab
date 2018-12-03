package com.app.use.webApi.service;

import java.util.Date;
import java.util.List;

import com.app.use.common.dto.VoteInfoDto;
import com.app.use.entity.VoteInfo;
import com.app.use.entity.VoteInfoUser;
import com.app.use.webApi.form.VoteInfoForm;

public interface VoteInfoService {

	VoteInfoDto getVoteInfo(Date nowDate);

	boolean registerVoteInfo(VoteInfoForm voteInfoForm);

	List<VoteInfoUser> getResultVoteInfo(VoteInfo voteInfo);
}
