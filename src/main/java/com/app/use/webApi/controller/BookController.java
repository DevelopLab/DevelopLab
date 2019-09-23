package com.app.use.webApi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.use.common.component.SessionModelManager;

@Controller
public class BookController {

	@Autowired
	private SessionModelManager sessionModelManager;

	/**
	 * 初期化処理。
	 * @return WebGL画面
	 */
	@GetMapping("/book")
	public String init(HttpSession session, Model model) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		return "book";
	}
}
