package com.company.photodiary.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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
		
		try {
			
			loginService.signUp(userModel);
		} catch(Exception e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "fail");
		}
	
		return "redirect:" + request.getHeader("referer");
		
		
	}
	
}
