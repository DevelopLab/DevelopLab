package com.app.use.webApi.service;

import java.util.List;

import com.app.use.entity.Notice;
import com.app.use.webApi.form.HomeForm;

public interface HomeService {

	boolean userProfile(String id, HomeForm homeForm);

	List<Notice> userNotice(int limit);
}
