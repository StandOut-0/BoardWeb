<%@page contentType="text/html; charset=EUC-KR" %>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
		<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


			<p class="text-end">
			
			<!-- ����ڸ�  -->
				<b class="me-2 small">${userName }</b>
				<!-- ����ڸ�  -->
				
				<!-- �α׾ƿ� ��ư -->
				<a href="logout.do" class="btn btn-sm btn-danger">
				<spring:message code='message.user.login.logOutBtn' />
				</a>
				<!-- �α׾ƿ� ��ư -->
				
			</p>


			<!-- �˻� ���� -->
			<form action="getBoardList.do" method="post">
				<div class="d-flex mb-3">
					<select name="searchCondition" class="form-select rounded-0 rounded-start small" style="width:130px">
					
					<option value="TITLE" class="small">
					<!-- �� ���� TITLE, �������� ǥ�õ�-->
					<spring:message code='message.board.list.search.condition.title' /></option>
					
					<option value="CONTENT" class="small">
					<!-- �� ���� CONTENT, �������� ǥ�õ�-->
					<spring:message code='message.board.list.search.condition.content' /></option>
						
					</select>
					
					<!-- �˻��� -->
					<input class="form-control rounded-0" name="searchKeyword" type="text" />
					
					<!-- �˻� -->
					<input class="btn btn-main rounded-0 rounded-end" type="submit"
						value="<spring:message code='message.board.list.search.condition.btn'/>" />
				</div>

			</form>
			
			
			
			
			
			<!-- �˻� ���� -->
			<table width="700" class="table table-sm border-top">
			
			<!-- THEAD -->
				<tr class="bg-light">
					<th style="width:50px">
					<!-- THEAD �۹�ȣ -->
						<spring:message code="message.board.list.table.head.seq" />
					</th>
					<th>
					<!-- THEAD �� ���� --> 
						<spring:message code="message.board.list.table.head.title" />
					</th>
					<th>
					<!-- THEAD �ۼ��� --> 
						<spring:message code="message.board.list.table.head.writer" />
					</th>
					<th>
					<!-- THEAD ����� -->
						<spring:message code="message.board.list.table.head.regDate" />
					</th>
					<th class="text-center">
					<!-- THEAD ��ȸ�� -->
						<spring:message code="message.board.list.table.head.cnt" />
					</th>
				</tr>
			<!-- THEAD -->
				
				
				<c:forEach items="${boardList }" var="board">
					<tr>
						<!-- �۹�ȣ -->
						<td>${board.seq }</td>
						
						<!-- �� ���� --> 
						<td align="left">
						<a class="text-decoration-none d-inline-block text-truncate tdMustbeWitdh150InMobile"  href="getBoard.do?seq=${board.seq }&cnt=${board.cnt}">${board.title }</a>
						</td>
						
						<!-- �ۼ��� --> 
						<td>${board.writer }</td>
						
						<!-- ����� -->
						<td>${board.regDate }</td>
						
						<!-- ��ȸ�� -->
						<td class="text-center">${board.cnt }</td>
					</tr>
				</c:forEach>
				
				
			</table>
			<br>
			<div class="d-grid gap-2">
			
			<!-- ���۾��� -->
				<a href="newBoard.do" class="btn btn-main btn-lg">
					<spring:message code="message.board.list.link.insertBoard" />
				</a>
			<!-- ���۾��� -->
			
			</div>