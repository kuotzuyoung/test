package com.test.dao;

import org.apache.ibatis.session.SqlSession;

public interface UserDao {
	public boolean verify(String username, String password, SqlSession session);//verify username and passwd
}
