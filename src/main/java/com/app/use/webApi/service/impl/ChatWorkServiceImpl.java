package com.app.use.webApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.common.message.ChatWorkMessageFormat;
import com.app.use.external.api.ChatWorkApi;
import com.app.use.webApi.form.SendMessageForm;
import com.app.use.webApi.service.ChatWorkService;

@Service
public class ChatWorkServiceImpl implements ChatWorkService {

	@Autowired
	private ChatWorkApi chatWorkApi;

	@Override
	public boolean sendMessage(SendMessageForm sendMessageForm) {
		String message = ChatWorkMessageFormat.titleInfo(sendMessageForm);
		chatWorkApi.postMessage(message);

		return true;
	}

}
