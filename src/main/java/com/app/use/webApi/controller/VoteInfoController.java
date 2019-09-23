package com.app.use.webApi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.use.common.dto.ResultVoteInfoDto;
import com.app.use.common.dto.VoteInfoDto;
import com.app.use.common.util.StringUtil;
import com.app.use.entity.VoteInfo;
import com.app.use.entity.VoteInfoUser;
import com.app.use.webApi.form.VoteInfoForm;
import com.app.use.webApi.service.VoteInfoService;

@Controller
@RequestMapping("/vote")
public class VoteInfoController {

	@Autowired
	private VoteInfoService voteInfoService;

	/**
	 * 初期化処理。
	 * @return 投票画面
	 */
	@RequestMapping("")
	public String init(HttpSession session, Model model) {

		Date nowDate = new Date();
		VoteInfoDto voteInfoDto = voteInfoService.getVoteInfo(nowDate);
		if (voteInfoDto == null) {
			model.addAttribute("false", false);
			return "/vote/result";
		}

		Date deadline = voteInfoDto.getVote().getDeadlineDate();
		model.addAttribute("title", voteInfoDto.getVote().getTitle());
		model.addAttribute("deadline", StringUtil.datetimeFormat(deadline));
		model.addAttribute("voteInfoList", voteInfoDto.getVoteInfoList());
		if (nowDate.getTime() >= deadline.getTime()) {
			model.addAttribute("voteInfo", false);
			return "/vote/index";
		}

		model.addAttribute("comment", voteInfoDto.getVote().getComment());
		model.addAttribute("voteInfo", true);
		return "/vote/index";
	}

	/**
	 * 投票処理。
	 * @return 投票完了画面
	 */
	@PostMapping("/register")
	public String register(HttpSession session, @ModelAttribute VoteInfoForm voteInfoForm) {

		if (voteInfoForm == null) {
			return "error";
		}
		voteInfoService.registerVoteInfo(voteInfoForm);
		return "/vote/register";
	}

	/**
	 * 投票結果化処理。
	 * @return 投票結果画面
	 */
	@RequestMapping("/result")
	public String result(Model model) {
		Date nowDate = new Date();
		VoteInfoDto voteInfoDto = voteInfoService.getVoteInfo(nowDate);
		if (voteInfoDto == null) {
			model.addAttribute("result", false);
			return "/vote/result";
		}

		Date deadline = voteInfoDto.getVote().getDeadlineDate();
		if (nowDate.getTime() <= deadline.getTime()) {
			return "error";
		}
		model.addAttribute("title", voteInfoDto.getVote().getTitle());

		List<ResultVoteInfoDto> resultVoteInfoList = new ArrayList<ResultVoteInfoDto>();
		for (VoteInfo voteInfo : voteInfoDto.getVoteInfoList()) {
			List<VoteInfoUser> voteInfoUserList = voteInfoService.getResultVoteInfo(voteInfo);
			resultVoteInfoList.add(new ResultVoteInfoDto(voteInfo, voteInfoUserList));
		}

		// 投票数を降順で集計する。
		resultVoteInfoList.sort((a,b)-> b.getVoteInfoUserList().size() - a.getVoteInfoUserList().size());

		model.addAttribute("resultVoteInfoList", resultVoteInfoList);
		model.addAttribute("result", true);
		return "/vote/result";
	}
}
