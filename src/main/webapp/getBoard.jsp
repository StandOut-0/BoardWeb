<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
	// 1. 리스트 페이지에서 넘겨받은 글번호를 get
	String seq = request.getParameter("seq");

	// 2. DB 연동
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	BoardDAO boardDAO = new BoardDAO();
	BoardVO board = boardDAO.getBoard(vo);

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 상세</title>
</head>
<body>
	<center>
		<h1>글 상세</h1>
		<a href="logout_proc.jsp">Log-out</a>
		<hr>
		
		<!-- submit할경우, updateBoard_proc.jsp로  post형태로 이동한다. -->
		<form action="updateBoard_proc.jsp" method="post">
			
			<!-- 글을 수정하려면 글의 제목/내용/게시글번호를 알아야함으로 
			form 태그 밑에 게시글 번호도 같이 전달될 수있도록 한다. -->
			<input name="seq" type="hidden" value="<%=board.getSeq()%>" />
			
			
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input name="title" type="text"
						value="<%=board.getTitle()%>" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><%=board.getWriter()%></td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10">
						<%=board.getContent()%></textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left"><%=board.getRegDate()%></td>
				</tr>
				<tr>
					<td bgcolor="orange">조회수</td>
					<td align="left"><%=board.getCnt()%></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit"
						value="글 수정" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteBoard_proc.jsp?seq=<%=board.getSeq()%>">글삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList.jsp">글목록</a>
	</center>
</body>
</html>
