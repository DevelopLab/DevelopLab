package com.app.use.api.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.use.api.json.UnityChanJson;
import com.app.use.api.json.UserJson;
import com.app.use.api.service.UnityChanService;
import com.app.use.common.util.StringUtil;

@RestController
@RequestMapping(value = "/unityChan")
public class UnityChanController {

	@Autowired
	private UnityChanService unityChanService;

	/**
	 *・挨拶AIP
	 *
	 * MediaType.APPLICATION_JSON_VALUE["application/json; charset=UTF-8"]
	 * @return ログイン画面
	 */
	@ResponseBody
	@RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UnityChanJson greeting(HttpSession session) {

		Object userId = session.getAttribute("userId");
//		if (userId == null) {
//			return userSessionTimeOut();
//		}
		UnityChanJson unityChanResponse = unityChanService.nowTimeGreeting(userId.toString());
		return unityChanResponse;
	}

	/**
	 * 初期化処理。
	 *
	 * MediaType.APPLICATION_JSON_VALUE["application/json; charset=UTF-8"]
	 * @return ログイン画面
	 */
	@ResponseBody
	@RequestMapping(value = "/conversation", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UnityChanJson conversation(@RequestBody UserJson userRequest, HttpSession session) {

//		Object userId = session.getAttribute("userId");
//		if (userId == null) {
//			return userSessionTimeOut();
//		}
		UnityChanJson unityChanResponse = unityChanService.conversation(userRequest);
		return unityChanResponse;
	}

	private UnityChanJson userSessionTimeOut() {
		UnityChanJson unityChanResponse = new UnityChanJson();
		unityChanResponse.setResultCode("W00");
		String[] message = {"Amaterasuとのセッションの接続が切れました。" + StringUtil.LINE_SEPARATOR + "ログイン画面に戻ります。"};
		unityChanResponse.setErrorMessage(message);
		unityChanResponse.setEmotion("SessionTimeOut");
		return unityChanResponse;
	}
}
