package com.springbook.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}

	

	// 글 수정
//	@ModelAttribute("board")로 저장되는 데이터가 있다면
//	@SessionAttributes("board") 세션에도 자동으로 저장하라. = null값으로 들어오지않음
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) {
		System.out.println("번호: "+ vo.getSeq());
		System.out.println("제목: "+ vo.getTitle());
		System.out.println("작성자: "+ vo.getWriter());
		System.out.println("내용: "+ vo.getContent());
		System.out.println("등록일: "+ vo.getRegDate());
		System.out.println("조회수: "+ vo.getCnt());
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
	
	
	//getBoardList가 실행되기전에 먼저실행된다.
	@ModelAttribute("conditionMap")
	public Map<String, String> SearchCondition(){
		Map<String, String> conditionMap = new HashMap <String, String>();
		conditionMap.put("제목","TITLE");
		conditionMap.put("내용","CONTENT");
		return conditionMap;
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
		
//		String condition = vo.getSearchCondition();
//		String keyword = vo.getSearchKeyword();
//		System.out.println("검색조건"+condition);
//		System.out.println("검색단어"+keyword);
		
		
		
		return "getBoardList.jsp";
	}
}
