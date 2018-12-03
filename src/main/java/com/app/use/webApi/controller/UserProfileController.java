package com.app.use.webApi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.use.common.component.SessionModelManager;
import com.app.use.common.type.GenderType;
import com.app.use.common.type.SexType;
import com.app.use.webApi.form.UserProfileForm;
import com.app.use.webApi.service.UserProfileService;


@Controller
@RequestMapping("/profile")
public class UserProfileController {

	@Autowired
	private SessionModelManager sessionModelManager;

	@Autowired
	private UserProfileService userProfileService;

	/**
	 * 初期化処理。
	 *
	 * @return プロフィール画面
	 */
	@RequestMapping("")
	public String init(@ModelAttribute UserProfileForm userProfileForm, Model model, HttpSession session) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}
		if (!userProfileService.getUserProfile(sessionModelManager.getUserId(), userProfileForm)) {
			return "redirect:login";
		}
		this.setModel(userProfileForm, model);

		return "profile";
	}

	/**
	 * プロフィール更新処理。
	 *
	 * @return プロフィール画面
	 */
	@PostMapping("/update")
	public String uploadFile(@ModelAttribute UserProfileForm userProfileForm, Model model, HttpSession session) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		// セッションのユーザIDを設定
		userProfileForm.setId(sessionModelManager.getUserId());

		if (userProfileService.updateProfile(userProfileForm)) {
			this.setModel(userProfileForm, model);
		}

		return "forward:/profile";
	}

	private void setModel(UserProfileForm userProfileForm, Model model) {
		model.addAttribute("name", userProfileForm.getName());
		model.addAttribute("imageIconPath", userProfileForm.getImageIcon());
		model.addAttribute("genderType", GenderType.values());
		model.addAttribute("sexType", SexType.values());
	}
}
