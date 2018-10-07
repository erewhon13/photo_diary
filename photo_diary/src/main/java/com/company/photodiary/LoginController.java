package com.company.photodiary;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
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
	@RequestMapping(value = "/login/signUp", method = RequestMethod.GET)
	public ModelAndView findIdPopup() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/page/signUp");
		return model;
	}
	
	
}
