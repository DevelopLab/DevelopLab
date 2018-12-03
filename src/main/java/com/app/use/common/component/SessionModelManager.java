package com.app.use.common.component;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.app.use.common.type.AuthorityType;

@Component
public class SessionModelManager {

	private String userId;

	private String userName;

	private String userAuthority;

	public boolean addUserSomeObjects(Model model, HttpSession session) {
		Object userId = session.getAttribute("userId");
		Object userName = session.getAttribute("userName");
		Object userAuthority = session.getAttribute("userAuthority");

		if (userId == null || userName == null || userAuthority == null) {
			return false;
		}

		this.userId = userId.toString();
		this.userName = userName.toString();
		this.userAuthority = userAuthority.toString();

		model.addAttribute("userId", userId);
		model.addAttribute("userName", userName.toString());
		model.addAttribute("userAuthority", userAuthority);
		return true;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserAuthority() {
		return userAuthority;
	}
}
