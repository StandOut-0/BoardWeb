package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model modal) {
		modal.addAttribute("board", boardDAO.getBoard(vo)); // Model 정보 저장
		return "getBoard.jsp";
	}

	// 글 목록 검색
	//@RequestParam 
	// value 화면에서 전달될 파라미터 이름
	// defaultValue 전달될 파라미터 정보가 없을때 설정할 기본값
	// required 생략여부
	@RequestMapping("/getBoardList.do")
	public String getBoardList(
//			@RequestParam(value="searchCondition", defaultValue ="TITLE", required = false ) String condition,
//			@RequestParam(value="searchKeyword", defaultValue ="", required = false ) String keyword,
			BoardVO vo, BoardDAO boardDAO, Model modal) {
		modal.addAttribute("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
		
		String condition = vo.getSearchCondition();
		String keyword = vo.getSearchKeyword();
		
		System.out.println("검색조건"+condition);
		System.out.println("검색단어"+keyword);
		return "getBoardList.jsp";
	}
}
