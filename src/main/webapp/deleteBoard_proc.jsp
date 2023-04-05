<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
	// 1. 사용자 입력 정보 추출
	String seq = request.getParameter("seq");

	// 2. 값을 가지고 deleteBoard() 메소드 수행
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);

	// 3. 완료후 getBoardList 리스트 페이지로 이동한다.
	response.sendRedirect("getBoardList.jsp");
%>