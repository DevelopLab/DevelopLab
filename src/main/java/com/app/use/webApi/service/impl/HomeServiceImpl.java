package com.app.use.webApi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.use.entity.Notice;
import com.app.use.entity.User;
import com.app.use.webApi.form.HomeForm;
import com.app.use.webApi.repository.HomeRepository;
import com.app.use.webApi.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeRepository homeRepository;

	@Override
	public boolean userProfile(String id, HomeForm homeForm) {

		User user = homeRepository.findUserProfile(id);
		if (user == null) {
			return false;
		}
		if ("".equals(user.getName())) {
			return false;
		}

		homeForm.setName(user.getName());
		homeForm.setImageIcon(user.getImageIcon());
		return true;
	}

	@Override
	public List<Notice> userNotice(int limit) {
		List<Notice> noticeList = homeRepository.newNotice(limit);
		return noticeList;
	}
}
