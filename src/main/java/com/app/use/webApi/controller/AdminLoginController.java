package com.app.use.webApi.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.use.webApi.form.LoginForm;
import com.app.use.webApi.form.VoteForm;
import com.app.use.webApi.service.LoginService;
import com.app.use.webApi.service.VoteInfoService;

@Controller
@RequestMapping(value = "/admin")
public class AdminLoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private VoteInfoService voteInfoService;

	/**
	 * 初期化処理。
	 * @return 管理者ログイン画面
	 */
	@GetMapping("/login")
	public String init() {
		return "admin/login";
	}

	/**
	 * ログイン処理。
	 * @return HOME画面
	 */
	@PostMapping("/login")
	public String login(@ModelAttribute LoginForm loginForm, HttpSession session) {

		boolean authenticateFlag = loginService.forAdminAuthenticate(loginForm);
		if (!authenticateFlag) {
			return "redirect:login";
		}


		session.setAttribute("userId", loginForm.getId());
		return "redirect:home";
	}

	/**
	 * 初期化処理。
	 * @return 管理者ログイン画面
	 */
	@GetMapping("/vote")
	public String vote(@ModelAttribute VoteForm voteForm) {
		return "admin/vote";
	}

	/**
	 * 投票マスタ登録処理。
	 * @return 投票マスタ画面
	 */
	@PostMapping("/vote/register")
	public String register(@ModelAttribute @Validated VoteForm voteForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "admin/vote";
		}

		LocalDateTime deadlineDate = LocalDateTime.parse(voteForm.getDeadlineDate());
		if (LocalDateTime.now().isAfter(deadlineDate)) {
			model.addAttribute("message", "締め切り日時は現在日時より後にしてください。");
			return "admin/vote";
		}

		LocalDateTime startDate = LocalDateTime.parse(voteForm.getStartDate());
		LocalDateTime endDate = LocalDateTime.parse(voteForm.getEndDate());
		if (startDate.isAfter(endDate)) {
			model.addAttribute("message", "終了日時は開始日時より後にしてください。");
			return "admin/vote";
		}

		boolean registerResult = voteInfoService.registerVote(voteForm);
		if (!registerResult) {
			model.addAttribute("message", "登録失敗しました。");
			return "admin/vote";
		}
		model.addAttribute("message", "登録しました。");
		return "redirect:/vote";
	}
}
