package com.app.use.webApi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.use.common.component.SessionModelManager;

@Controller
@RequestMapping(value = "/developer/home")
public class DeveloperHomeController {

	@Autowired
	private SessionModelManager sessionModelManager;

	@GetMapping("")
	public String home(Model model, HttpSession session) {

		if (!sessionModelManager.addUserSomeObjects(model, session)) {
			return "redirect:login";
		}

		return "developer/home";
	}
}
