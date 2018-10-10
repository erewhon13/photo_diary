package com.company.photodiary.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.photodiary.model.BoardModel;
import com.company.photodiary.model.UserModel;
import com.company.photodiary.service.BoardService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
    private BoardService boardService;
	
	
	//게시판 리스트
	@RequestMapping(value = "/diaryList", method = RequestMethod.GET)
	public String diaryList(Locale locale, Model model, UserModel userModel) {
		System.out.println("@@@@@@@@@@@@@@@@"+userModel.getEmail());
		return "/page/diaryList";
	}
	
	
	//글쓰기 페이지
	@RequestMapping(value = "/diaryWrite", method = RequestMethod.GET)
	public String diaryWrite(Locale locale, Model model) {
		
		return "/page/diaryWrite";
	}
		
	//글쓰기action
	@RequestMapping(value = "/writeAction", method = RequestMethod.POST)
	public String writeAction(BoardModel boardModel, RedirectAttributes redirectAttributes, HttpServletRequest request) {
		
		try {
			boardService.writeAction(boardModel);
		} catch(Exception e) {
			LOGGER.error("error", e);
			redirectAttributes.addFlashAttribute("message", "fail");
		}
		
		return "/page/diaryList";
	}
	
	
	
}
