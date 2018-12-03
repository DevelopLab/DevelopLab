package com.app.use.config;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListenerManager implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
	    // タイムアウト時間を設定
	    HttpSession session = se.getSession();
	    session.setMaxInactiveInterval(1800);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// セッション破棄時の処理
		se.getSession().invalidate();
	}
}
