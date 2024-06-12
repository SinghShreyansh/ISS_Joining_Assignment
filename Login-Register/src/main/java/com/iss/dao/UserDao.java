package com.iss.dao;

import com.iss.dao.User;


public interface UserDao {

	boolean isValidUser(String username, String password);
	
	boolean addUser(User user);
	

}
