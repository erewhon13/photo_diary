package com.company.photodiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.photodiary.dao.LoginDAO;
import com.company.photodiary.model.UserModel;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	

	@Override
	public void signUp(UserModel userModel) throws Exception {
		loginDAO.signUp(userModel);
	}
	
	
}
