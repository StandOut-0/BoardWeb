<%@page contentType="text/html; charset=EUC-KR" %>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


		<div class="login text-center">
			<form action="login.do" method="post">

				<div class="d-flex flex-column m-auto">
					<div class="d-flex mb-2">
						<div class="small" style="width: 150px;"><spring:message code="message.user.login.id" /></div>
						<input class="form-control form-control-sm" type="text" name="id" value="${user.id }" />
					</div>
					<div class="d-flex">
						<div class="small" style="width: 150px;"><spring:message code="message.user.login.password" /></div>
						<input class="form-control form-control-sm" type="password" name="password" value="${user.password }" />
					</div>
					<div class="d-grid gap-2">
						<input type="submit" class="btn btn-main mt-3 small"
							value="<spring:message code='message.user.login.loginBtn'/>" />
					</div>
				</div>
				
			</form>
		</div>