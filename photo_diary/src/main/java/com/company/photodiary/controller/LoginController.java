package com.company.photodiary.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.photodiary.model.UserModel;
import com.company.photodiary.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	
	 @Autowired
     private LoginService loginService;
	
	
	 /**
	 * 로그인페이지(홈)
	 * 
	 * @return 
	 */
	 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "/page/login";
	}
	
	/**
	 * 로그인 처리
	 */
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(UserModel usermodel, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		//boolean result = loginService.loginCheck(usermodel, session);
		ModelAndView mav = new ModelAndView();
		
        /*if (loginUser != null) {
        	UserModel loginUser = loginService.viewUser(usermodel);
            // parameter로 받은 평문과 DB에 저장된 암호화값 비교
            if (BCrypt.checkpw(usermodel.getPwd(), loginUser.getPwd())) {
                session.setAttribute("loginUser", loginUser);
                mav.setViewName("/page/diaryList");
            }
        }
 */
        // 해당 email을 가진 유저가 없거나 비밀번호 불일치
        mav.addObject("msg","failure");
        mav.setViewName("/page/login");
		
		/*
		if(result == true) { //로그인성공			
			mav.setViewName("/page/diaryList");
			
		}else { //로그인실패
			mav.setViewName("/page/login");
			mav.addObject("msg","failure");
		}
		 */
		return mav;
	}
	
	/**
	 * 로그아웃 처리
	 */
	@RequestMapping(value = "/logOut", method = RequestMethod.POST)
	public ModelAndView loginOut(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		
		loginService.logOut(session);
		ModelAndView mav = new ModelAndView();
		//mav.setViewName("page/login");
		mav.setViewName("/page/login");
		mav.addObject("msg","logout");

		return mav;
	}
	
	/**
	 * 회원가입 팝업
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/login/signPopup", method = RequestMethod.GET)
	public ModelAndView signUpPopup() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/page/signUp");
		return model;
	}
	
	
	/**
	 * 회원가입
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/login/signUp", method = RequestMethod.POST)
	public String signUp(UserModel userModel,RedirectAttributes redirectAttributes, HttpServletRequest request) {
		
		try {
			loginService.signUp(userModel);
		} catch(Exception e) {
			LOGGER.error("error", e);
			redirectAttributes.addFlashAttribute("message", "fail");
		}
	
		return "/login/signPopup";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String RegisterPost(UserModel userModel, Model model, RedirectAttributes rttr, HttpServletRequest request, HttpSession session) throws Exception {
		LOGGER.info("회원가입...");
		LOGGER.info(userModel.toString());
		//loginService.create(userModel);
		rttr.addFlashAttribute("authmsg" , "가입시 사용한 이메일로 인증해주십시요");
		return "redirect:/";
	}
	
	
	
	
}
