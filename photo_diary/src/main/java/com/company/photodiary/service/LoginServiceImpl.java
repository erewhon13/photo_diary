package com.company.photodiary.service;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.photodiary.common.SHA256Util;
import com.company.photodiary.dao.LoginDAO;
import com.company.photodiary.model.UserModel;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	

	@Override
	public void signUp(UserModel userModel) throws Exception {
		
		//비밀번호 암호화처리
		/*	String salt = SHA256Util.generateSalt();
        String newPassword = SHA256Util.getEncrypt(userModel.getPwd(), salt);
        userModel.setPwd(newPassword);
        userModel.setSalt(salt);*/
		
		String hashPassword = BCrypt.hashpw(userModel.getPwd(), BCrypt.gensalt());
		userModel.setPwd(hashPassword);

        
        loginDAO.signUp(userModel);
		
	}

	//로그인체크
	@Override
	public boolean loginCheck(UserModel userModel, HttpSession session) {

		boolean result  = loginDAO.loginCheck(userModel);
		
		if(result) {

			UserModel usermodel2 = viewUser(userModel);
			
			session.setAttribute("email", usermodel2.getEmail());
			session.setAttribute("nickNmae", usermodel2.getNickname());
		
		}
		return result;
	}
	
	//회원로그인정보
	@Override
	public UserModel viewUser(UserModel userModel) {
		return loginDAO.viewUser(userModel);
	}
	
	

	//로그아웃
	@Override
	public void logOut(HttpSession session) {
		session.invalidate();
		
	}


	
}
