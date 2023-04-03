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
		//BoardServiceImpl ��ü�� �����ɶ� LogAdvice��ü�� ���� �����Ѵ�.
//		log = new LogAdvice();
//		log = new Log4jAdvice();
	}

	//����Ͻ� ������ �����ϱ����� �α׸� ȣ���Ѵ�. log.printLog();
	//�̰�� LogAdvice�� �ٸ� Ŭ������ �����ؾ� �ϰų� �����ɿ� �ش��ϴ� printLog�� ����� �����ϰ� ��ó�ϱ� ��ưԵȴ�.
	
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
