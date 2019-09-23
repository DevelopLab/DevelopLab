package com.app.use.webApi.repository;

import java.util.List;

import com.app.use.entity.Notice;
import com.app.use.entity.User;

public interface HomeRepository {

	User findUserProfile(String id);

	List<Notice> newNotice(int limit);
}
