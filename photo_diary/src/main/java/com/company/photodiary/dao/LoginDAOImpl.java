package com.company.photodiary.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.photodiary.model.UserModel;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private AbstractDAO abstractDAO;
	
	public void signUp(UserModel userModel) {
		abstractDAO.insert("login.signUp", userModel);
		
	}
	
	
}
