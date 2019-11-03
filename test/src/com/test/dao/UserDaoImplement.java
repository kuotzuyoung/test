package com.test.dao;

import org.apache.ibatis.session.SqlSession;

import com.test.entity.*;


public class UserDaoImplement implements UserDao {
	public boolean verify(String username, String password, SqlSession session){
		User user = (User) session.selectOne("UserMapper.getUserByName", username);
			
	    if(user == null){
	    	session.close();
	    	return false;
	    }
	    else if(user.getUsername().equals(username) && user.getPassword().equals(password))
		{
	    	session.close();
	    	return true;
		}
		else
		{
			session.close();
			return false;
		}
		
	    
	} 
}
