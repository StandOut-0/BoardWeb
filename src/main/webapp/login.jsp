<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id" value="${userVO.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<!-- 스프링 컨테이너가 생성하는 Command 객체의 이름을 클래스 이름의 첫글자를 소문자로 변경한 이름이 자동으로 설정된다. -->
					<td><input type="password" name="password" value="${userVO.password }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>