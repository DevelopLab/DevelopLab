package com.app.use.webApi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.use.common.component.SessionModelManager;

@Controller
public class WebGLController {

	@Autowired
	private SessionModelManager sessionModelManager;

	/**
	 * 初期化処理。
	 * @return WebGL画面
	 */
	@GetMapping("/webGL")
	public String init(HttpSession session, Model model) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		return "webGL";
	}

	/**
	 * WebGL起動処理。
	 * @return WebGL画面
	 */
	@PostMapping("/amaterasu")
	public String deepLoveMachineLearning(HttpSession session, Model model) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		return "amaterasu/index";
	}
}
