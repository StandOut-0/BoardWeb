<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div class="login text-center">

<!-- login ��Ʈ�ѷ��� post �޼ҵ尡 ���� ��. -->
	<form action="login.do" method="post">

		<div class="d-flex flex-column m-auto w-100">
			<div class="d-flex mb-2 w-100">
				<div class="small" style="width: 150px;">
				
				<!-- �� ���� ���̵�, ID�� ǥ�õ� -->
					<spring:message code="message.user.login.id" />
				<!-- �� ���� ���̵�, ID�� ǥ�õ� -->
				
				</div>
				
				<!-- ���̵� �Է�   -->
				<input class="form-control form-control-sm" type="text" name="id"
					value="${user.id }" />
				<!-- ���̵� �Է�   -->
				
			</div>
			<div class="d-flex w-100">
				<div class="small" style="width: 150px;">
				
				<!-- �� ���� ��й�ȣ PASSWORD�� ǥ�õ� -->
					<spring:message code="message.user.login.password" />
				<!-- �� ���� ��й�ȣ PASSWORD�� ǥ�õ� -->
				
				</div>
				
				<!-- ��й�ȣ �Է� -->
				<input class="form-control form-control-sm" type="password"
					name="password" value="${user.password }" />
				<!-- ��й�ȣ �Է� -->
				
			</div>
			<div class="d-grid gap-2">
			
			<!-- �α��� -->
				<input type="submit" class="btn btn-main mt-3 small"
					value="<spring:message code='message.user.login.loginBtn'/>" />
				<!-- �α��� -->
				
			</div>
		</div>

	</form>
</div>