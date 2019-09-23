package com.app.use.common.message;

import com.app.use.webApi.form.SendMessageForm;

public class ChatWorkMessageFormat {

	public static String titleInfo(SendMessageForm sendMessageForm) {
		String infoStart = "[info]";
		String infoEnd = "[/info]";
		String titleStart = "[title]";
		String titleEnd = "[/title]";
		String codeStart = "[code]";
		String codeEnd = "[/code]";

		String message = "";
		message = infoStart
				+ titleStart
				+ sendMessageForm.getName() + "様からのお問い合わせ"
				+ titleEnd
				+ codeStart + sendMessageForm.getMessage() + codeEnd
				+ infoEnd;
		return message;
	}

	public static String udidRegister(String udid) {
		return "IOSのUDID登録依頼：{0}" + udid;
	}
}
