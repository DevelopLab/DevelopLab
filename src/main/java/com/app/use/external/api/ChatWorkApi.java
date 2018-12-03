package com.app.use.external.api;

import org.springframework.stereotype.Component;

import com.masahirosaito.chatwork4j.ChatWork4j;

@Component
public class ChatWorkApi {

	public boolean postMessage(String message) {

		ChatWork4j chatwork = new ChatWork4j("ed097829e1c203317ec5c9e1512e2cd1");
		chatwork.postMessage(125147335, message);
		return true;
	}
}
