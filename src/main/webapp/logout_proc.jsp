<%@page contentType="text/html; charset=EUC-KR"%>
<%
	// 1. ������ ������ �����ϱ�, �������� ����� ���� ��ü�� ���� �����Ѵ�.
	session.invalidate();
	// 2. ���� ���� ��, ���� ȭ������ �̵��Ѵ�.
	response.sendRedirect("login.jsp");
%>