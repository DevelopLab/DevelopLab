package com.app.use.webApi.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.use.entity.Notice;
import com.app.use.entity.User;
import com.app.use.infrastructure.dao.NoticeDao;
import com.app.use.infrastructure.dao.UserDao;
import com.app.use.webApi.repository.HomeRepository;

@Repository
public class HomeRepositoryImpl implements HomeRepository {

	@Autowired
	private UserDao userDao;

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public User findUserProfile(String id) {
		User user = userDao.findById(id);
		return user;
	}

	@Override
	public List<Notice> newNotice(int limit) {
		List<Notice> noticeList = noticeDao.selectAll(limit);
		return noticeList;
	}
}
