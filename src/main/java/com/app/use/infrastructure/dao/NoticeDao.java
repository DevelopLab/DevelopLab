package com.app.use.infrastructure.dao;

import java.util.List;

import com.app.use.entity.Notice;

public interface NoticeDao {

	public List<Notice> selectAll(int limit);
}
