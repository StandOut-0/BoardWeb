<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
	// 1. 사용자 입력 정보 추출
	request.setCharacterEncoding("EUC-KR");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	// 2. BoardVO에 받은정보를 set하여 이정보를 insertBoard().
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.insertBoard(vo);
	
	// 3. 완료 후 getBoardList로 이동한다.
	response.sendRedirect("getBoardList.jsp");
%>