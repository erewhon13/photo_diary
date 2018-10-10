package com.company.photodiary.service;

import javax.servlet.http.HttpSession;

import com.company.photodiary.model.UserModel;

public interface LoginService {

  public void signUp(UserModel userModel)throws Exception;
  
  public boolean loginCheck(UserModel userModel, HttpSession session);

  public UserModel viewUser(UserModel userModel);
  
  public void logOut(HttpSession session);

}
