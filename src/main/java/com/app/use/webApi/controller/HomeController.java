package com.app.use.webApi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.use.common.component.SessionModelManager;
import com.app.use.common.util.StringUtil;
import com.app.use.entity.Notice;
import com.app.use.webApi.form.HomeForm;
import com.app.use.webApi.form.SendMessageForm;
import com.app.use.webApi.service.ChatWorkService;
import com.app.use.webApi.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private SessionModelManager sessionModelManager;

	@Autowired
	private HomeService homeService;

	@Autowired
	private ChatWorkService chatWorkService;

	/**
	 * 初期化処理。
	 * @return ホーム画面
	 */
	@RequestMapping(value = "/home")
	public String init(@ModelAttribute HomeForm homeForm, Model model, HttpSession session) {

		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}
		String userId = sessionModelManager.getUserId();
		String userName = sessionModelManager.getUserName();

		boolean isFindUser = homeService.userProfile(userId, homeForm);
		if (!isFindUser) {
			return "redirect:login";
		}

		model.addAttribute("userId", userId);
		model.addAttribute("name", userName.toString());
		model.addAttribute("imageIconPath", homeForm.getImageIcon());

		// お知らせ情報を取得
		List<Notice> noticeList = homeService.userNotice(6); // 最新の6件を取得する。
		int number = 1;
		for (Notice notice : noticeList) {
			 model.addAttribute("notice" + number, notice);
			 model.addAttribute("title" + number, notice.getTitle());
			 model.addAttribute("noticeInfo" + number, notice.getNoticeInfo());
			 model.addAttribute("noticeDay" + number, StringUtil.dayFormat(notice.getNoticeDay()));
			 number++;
		}

		return "home";
	}

	/**
	 * ログアウト.
	 *
	 * @param session httpセッション
	 * @return ログイン画面
	 */
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		// セッションの削除
		session.removeAttribute("userId");

		return "redirect:login";
	}

	/**
	 *　開発アプリ遷移.
	 *
	 * @param screen 対象のシーン
	 * @param session httpセッション
	 * @return 対象のシーン画面
	 */
	@RequestMapping(value = "/home/{screen}")
	public String deepLoveMachineLearning(@PathVariable("screen") String screen, HttpSession session) {
		// セッションの確認
		Object userId = session.getAttribute("userId");
		if (userId == null) {
			return "redirect:login";
		}

		return "redirect:" + screen;
	}

	/**
	 * ログアウト.
	 *
	 * @param session httpセッション
	 * @return ログイン画面
	 */
	@PostMapping("/home/sendMessage")
	public String sendMessage(@ModelAttribute SendMessageForm sendMessageForm, Model model, HttpSession session ) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		sendMessageForm.setId(sessionModelManager.getUserId());
		sendMessageForm.setName(sessionModelManager.getUserName());
		if (!chatWorkService.sendMessage(sendMessageForm)) {
			return "redirect:login";
		}
		return "forward:/home";
	}

}
