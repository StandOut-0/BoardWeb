<%@page contentType="text/html; charset=EUC-KR" %>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
		<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


			<p class="text-end">
				<b class="me-2 small">${userName }</b><a href="logout.do" class="btn btn-sm btn-danger">Log-out</a>
			</p>

			</h3>

			<!-- 검색 시작 -->
			<form action="getBoardList.do" method="post">
				<div class="d-flex mb-3">
					<select name="searchCondition" class="form-select rounded-0 rounded-start" style="width:100px">
						<c:forEach items="${conditionMap }" var="option">
							<option value="${option.value }">${option.key }
						</c:forEach>
					</select>
					<input class="form-control rounded-0" name="searchKeyword" type="text" />
					<input class="btn btn-main rounded-0 rounded-end" type="submit"
						value="<spring:message code='message.board.list.search.condition.btn'/>" />
				</div>

			</form>
			<!-- 검색 종료 -->
			<table width="700" class="table table-sm border-top">
				<tr class="bg-light">
					<th style="width:50px">
						<spring:message code="message.board.list.table.head.seq" />
					</th>
					<th>
						<spring:message code="message.board.list.table.head.title" />
					</th>
					<th>
						<spring:message code="message.board.list.table.head.writer" />
					</th>
					<th>
						<spring:message code="message.board.list.table.head.regDate" />
					</th>
					<th class="text-center">
						<spring:message code="message.board.list.table.head.cnt" />
					</th>
				</tr>
				<c:forEach items="${boardList }" var="board">
					<tr>
						<td>${board.seq }</td>
						<td align="left">
						<a class="text-decoration-none d-inline-block text-truncate" style="max-width: 150px;" href="getBoard.do?seq=${board.seq }&cnt=${board.cnt}">${board.title }</a>
						</td>
						<td>${board.writer }</td>
						<td>${board.regDate }</td>
						<td class="text-center">${board.cnt }</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<div class="d-grid gap-2">
				<a href="newBoard.do" class="btn btn-main">
					<spring:message code="message.board.list.link.insertBoard" />
				</a>
			</div>