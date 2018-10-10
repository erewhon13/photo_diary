package com.company.photodiary.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.photodiary.model.UserModel;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private AbstractDAO abstractDAO;
	
	@Inject
	SqlSession sqlSession;
	
	public void signUp(UserModel userModel) {
		abstractDAO.insert("login.signUp", userModel);
		
	}

	@Override
	public boolean loginCheck(UserModel userModel) {
		String name = sqlSession.selectOne("login.loginCheck",userModel);
		return (name == null)?false:true;
	}

	@Override
	public UserModel viewUser(UserModel userModel) {
		return sqlSession.selectOne("login.viewUser",userModel);
	}

	@Override
	public void logOut(HttpSession session) {
		
	}
	
	
}
