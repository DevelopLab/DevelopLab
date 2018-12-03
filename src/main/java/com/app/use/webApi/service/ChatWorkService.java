package com.app.use.webApi.service;

import com.app.use.webApi.form.SendMessageForm;

public interface ChatWorkService {

	boolean sendMessage(SendMessageForm sendMessageForm);
}
