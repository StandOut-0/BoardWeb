<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
	// 1. ����� �Է� ���� ����
	String seq = request.getParameter("seq");

	// 2. ���� ������ deleteBoard() �޼ҵ� ����
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);

	// 3. �Ϸ��� getBoardList ����Ʈ �������� �̵��Ѵ�.
	response.sendRedirect("getBoardList.jsp");
%>