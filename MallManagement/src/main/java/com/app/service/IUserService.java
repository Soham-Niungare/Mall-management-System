package com.app.service;

import com.app.pojo.User;
public interface IUserService {
	User addNewUser(User user);
	User updateUser(User user);
	User login(User user);
	boolean logOut();
}
