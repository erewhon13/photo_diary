package com.company.photodiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.photodiary.dao.BoardDAO;
import com.company.photodiary.model.BoardModel;
import com.company.photodiary.model.UserModel;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	

	@Override
	public void writeAction(BoardModel boardModel) throws Exception {
		boardDAO.writeAction(boardModel);
	}

	
}
