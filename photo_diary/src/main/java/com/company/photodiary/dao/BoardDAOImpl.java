package com.company.photodiary.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.photodiary.model.BoardModel;
import com.company.photodiary.model.UserModel;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private AbstractDAO abstractDAO;
	
	public void writeAction(BoardModel boardModel) {
		abstractDAO.insert("board.writeAction", boardModel);
		
	}
	
	
}
