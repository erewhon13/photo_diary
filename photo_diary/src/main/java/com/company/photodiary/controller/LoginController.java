package com.company.photodiary.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.impl.Log4JLogger;
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
		
		System.out.println(userModel.getNickname());
		
		try {
			loginService.signUp(userModel);
		} catch(Exception e) {
			LOGGER.error("error", e);
			redirectAttributes.addFlashAttribute("message", "fail");
		}
	
		return "redirect:" + request.getHeader("referer");
		
		
	}
	
}
