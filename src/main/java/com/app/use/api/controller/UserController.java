package com.app.use.api.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.use.api.json.UserJson;
import com.app.use.api.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;


	/**
	 * 初期化処理。
	 *
	 * MediaType.APPLICATION_JSON_VALUE["application/json; charset=UTF-8"]
	 * @return 認証結果
	 */
	@ResponseBody
	@RequestMapping(value = "/authentication", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserJson conversation(@RequestBody UserJson userJson, HttpSession session) {

		UserJson userResponse = userService.authenticate(userJson);
		if ("N00".equals(userResponse.getResultCode())) {
			session.setAttribute("userId", userResponse.getId());
		}
		return userResponse;
	}
}
