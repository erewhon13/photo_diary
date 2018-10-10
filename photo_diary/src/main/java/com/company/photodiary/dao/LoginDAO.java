package com.company.photodiary.dao;

import javax.servlet.http.HttpSession;

import com.company.photodiary.model.UserModel;

public interface LoginDAO {

	public void signUp(UserModel userModel);
	
	public boolean loginCheck(UserModel userModel);
	
	public UserModel viewUser(UserModel userModel);
	
	public void logOut(HttpSession session);

}
