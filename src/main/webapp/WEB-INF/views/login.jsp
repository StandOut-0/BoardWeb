<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div class="login text-center">

<!-- login 컨트롤러의 post 메소드가 실행 됨. -->
	<form action="login.do" method="post">

		<div class="d-flex flex-column m-auto w-100">
			<div class="d-flex mb-2 w-100">
				<div class="small" style="width: 150px;">
				
				<!-- 언어에 따라 아이디, ID로 표시됨 -->
					<spring:message code="message.user.login.id" />
				<!-- 언어에 따라 아이디, ID로 표시됨 -->
				
				</div>
				
				<!-- 아이디 입력   -->
				<input class="form-control form-control-sm" type="text" name="id"
					value="${user.id }" />
				<!-- 아이디 입력   -->
				
			</div>
			<div class="d-flex w-100">
				<div class="small" style="width: 150px;">
				
				<!-- 언어에 따라서 비밀번호 PASSWORD로 표시됨 -->
					<spring:message code="message.user.login.password" />
				<!-- 언어에 따라서 비밀번호 PASSWORD로 표시됨 -->
				
				</div>
				
				<!-- 비밀번호 입력 -->
				<input class="form-control form-control-sm" type="password"
					name="password" value="${user.password }" />
				<!-- 비밀번호 입력 -->
				
			</div>
			<div class="d-grid gap-2">
			
			<!-- 로그인 -->
				<input type="submit" class="btn btn-main mt-3 small"
					value="<spring:message code='message.user.login.loginBtn'/>" />
				<!-- 로그인 -->
				
			</div>
		</div>

	</form>
</div>