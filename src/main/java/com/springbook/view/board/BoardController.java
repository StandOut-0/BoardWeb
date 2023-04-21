package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//글목록 변환처리
	//익스플로어는 버전에 따라서 json 데이터를 표시할수없으니 크롬으로 확인하자.
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		return boardList;
	}
	
	@RequestMapping(value = "/newBoard.do")
	public String newBoard(BoardVO vo) throws IOException{
		return "insertBoard";
	}
	
	
	//컨트롤러에서 DAO메소드를 호출하면 안되는 이유는 유지보수 과정에서 DAO클래스를 다른클래스로 쉽게 교체하기 위해서다.
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException{
		// 파일 업로드 처리
		// MultipartFile 객체가 제공하는 세개의 메소드
		//getUploadFile, getOriginalFilename, transferTo만 이용하면 간단하게 파일업로드를 처리할 수 있다.
		MultipartFile uploadFile = vo.getUploadFile();
		int boardNum = vo.getSeq();
		
		if(!uploadFile.isEmpty()){
			String fileName = uploadFile.getOriginalFilename();
			File file = new File("D:/board/" + boardNum);
			if (!file.exists()) {file.mkdir();}
			uploadFile.transferTo(new File(file,fileName));
		}
		
		boardService.insertBoard(vo);
		return "redirect:/getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {			
		boardService.updateBoard(vo);
		return "redirect:/getBoardList.do";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		System.out.println("삭제를 완료했습니다.");
		return "redirect:/getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장
		return "getBoard"; // View 이름 리턴
	}
	
	// 검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}

	// 글 목록 검색
		@RequestMapping("/getBoardList.do")
		public String getBoardList(BoardVO vo, Model model) {
			// Null Check
			if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
			if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
			
			System.out.println(vo.getSearchKeyword());
			// Model 정보 저장
			model.addAttribute("boardList", boardService.getBoardList(vo));																
			return "getBoardList"; // View 이름 리턴
		}
}
