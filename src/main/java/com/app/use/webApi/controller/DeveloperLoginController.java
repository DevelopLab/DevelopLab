package com.app.use.webApi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.use.webApi.form.LoginForm;
import com.app.use.webApi.service.LoginService;

@Controller
@RequestMapping(value = "/developer")
public class DeveloperLoginController {

	@Autowired
	private LoginService loginService;

	/**
	 * 初期化処理。
	 * @return 開発者ログイン画面
	 */
	@GetMapping("/login")
	public String init() {
		return "developer/login";
	}

	/**
	 * ログイン処理。
	 * @return HOME画面
	 */
	@PostMapping("/login")
	public String login(@ModelAttribute LoginForm loginForm, HttpSession session) {

		boolean authenticateFlag = loginService.forDeveloperAuthenticate(loginForm);
		if (!authenticateFlag) {
			return "redirect:login";
		}

		session.setAttribute("userId", loginForm.getId());
		session.setAttribute("userName", loginForm.getName());
		session.setAttribute("authority", loginForm.getAuthority());
		return "redirect:home";
	}
}
