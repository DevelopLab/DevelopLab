package com.app.use.common.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ApplicationConstant {

	@Value("${user.icon.dir.path}")
	private String userIconDirPath;

	public String getUserIconDirPath() {
		return userIconDirPath;
	}
}
