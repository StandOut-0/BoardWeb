<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
	// 1. ����� �Է� ���� ����
	request.setCharacterEncoding("EUC-KR");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	// 2. BoardVO�� ���������� set�Ͽ� �������� insertBoard().
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.insertBoard(vo);
	
	// 3. �Ϸ� �� getBoardList�� �̵��Ѵ�.
	response.sendRedirect("getBoardList.jsp");
%>