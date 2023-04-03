package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.common.Log4jAdvice;
//import com.springbook.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
//	private LogAdvice log;
//	private Log4jAdvice log;
	
	public BoardServiceImpl() {
		//BoardServiceImpl 객체가 생성될때 LogAdvice객체도 같이 생성한다.
//		log = new LogAdvice();
//		log = new Log4jAdvice();
	}

	//비즈니스 로직을 수행하기전에 로그를 호출한다. log.printLog();
	//이경우 LogAdvice를 다른 클래스로 변경해야 하거나 공통기능에 해당하는 printLog가 변경시 유연하게 대처하기 어렵게된다.
	
	public void insertBoard(BoardVO vo) {
//		log.printLog();
//		log.printLogging();
		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
//		log.printLog();
//		log.printLogging();
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
//		log.printLog();
//		log.printLogging();
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
//		log.printLog();
//		log.printLogging();
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
//		log.printLog();
//		log.printLogging();
		return boardDAO.getBoardList(vo);
	}
}
