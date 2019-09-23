package com.app.use.webApi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.use.common.component.SessionModelManager;
import com.app.use.common.message.ChatWorkMessageFormat;
import com.app.use.entity.MobileApp;
import com.app.use.webApi.form.SendMessageForm;
import com.app.use.webApi.service.ChatWorkService;
import com.app.use.webApi.service.MobileAppService;

@Controller
@RequestMapping(value = "/mobileApp")
public class MobileAppController {

	@Autowired
	private SessionModelManager sessionModelManager;

	@Autowired
    private MobileAppService mobileAppService;

	@Autowired
	private ChatWorkService chatWorkService;

	/**
	 * 初期化処理。
	 * @return モバイルアプリ画面
	 */
	@GetMapping("")
	public String init(HttpSession session, Model model) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		List<MobileApp> mobileAppList = mobileAppService.getMobileAppInfo();
		if (mobileAppList == null) {
			return "error";
		}
		model.addAttribute("mobileAppList", mobileAppList);
		return "mobileApp";
	}

	@PostMapping("/iosUdid")
	public String iosUdid(@RequestParam(name = "udid", required = false) String udid, HttpSession session, Model model) {
		// セッションの確認
		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		boolean updateResult = mobileAppService.updateIosUdid(sessionModelManager.getUserId(), udid);
		if (!updateResult) {
			return "error";
		}

		SendMessageForm sendMessageForm = new SendMessageForm();
		sendMessageForm.setName(sessionModelManager.getUserName());
		sendMessageForm.setMessage(ChatWorkMessageFormat.udidRegister(udid));
		boolean sendResult = this.chatWorkService.sendMessage(sendMessageForm);

		if (!sendResult) {
			return "error";
		}

		return "mobileApp";
	}
}
