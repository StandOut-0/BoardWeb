<%@page contentType="text/html; charset=EUC-KR" %>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
		<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


			<p class="text-end">
			
			<!-- 사용자명  -->
				<b class="me-2 small">${userName }</b>
				<!-- 사용자명  -->
				
				<!-- 로그아웃 버튼 -->
				<a href="logout.do" class="btn btn-sm btn-danger">
				<spring:message code='message.user.login.logOutBtn' />
				</a>
				<!-- 로그아웃 버튼 -->
				
			</p>


			<!-- 검색 시작 -->
			<form action="getBoardList.do" method="post">
				<div class="d-flex mb-3">
					<select name="searchCondition" class="form-select rounded-0 rounded-start small" style="width:130px">
					
					<option value="TITLE" class="small">
					<!-- 언어에 따라 TITLE, 제목으로 표시됨-->
					<spring:message code='message.board.list.search.condition.title' /></option>
					
					<option value="CONTENT" class="small">
					<!-- 언어에 따라 CONTENT, 본문으로 표시됨-->
					<spring:message code='message.board.list.search.condition.content' /></option>
						
					</select>
					
					<!-- 검색어 -->
					<input class="form-control rounded-0" name="searchKeyword" type="text" />
					
					<!-- 검색 -->
					<input class="btn btn-main rounded-0 rounded-end" type="submit"
						value="<spring:message code='message.board.list.search.condition.btn'/>" />
				</div>

			</form>
			
			
			
			
			
			<!-- 검색 종료 -->
			<table width="700" class="table table-sm border-top">
			
			<!-- THEAD -->
				<tr class="bg-light">
					<th style="width:50px">
					<!-- THEAD 글번호 -->
						<spring:message code="message.board.list.table.head.seq" />
					</th>
					<th>
					<!-- THEAD 글 제목 --> 
						<spring:message code="message.board.list.table.head.title" />
					</th>
					<th>
					<!-- THEAD 작성자 --> 
						<spring:message code="message.board.list.table.head.writer" />
					</th>
					<th>
					<!-- THEAD 등록일 -->
						<spring:message code="message.board.list.table.head.regDate" />
					</th>
					<th class="text-center">
					<!-- THEAD 조회수 -->
						<spring:message code="message.board.list.table.head.cnt" />
					</th>
				</tr>
			<!-- THEAD -->
				
				
				<c:forEach items="${boardList }" var="board">
					<tr>
						<!-- 글번호 -->
						<td>${board.seq }</td>
						
						<!-- 글 제목 --> 
						<td align="left">
						<a class="text-decoration-none d-inline-block text-truncate tdMustbeWitdh150InMobile"  href="getBoard.do?seq=${board.seq }&cnt=${board.cnt}">${board.title }</a>
						</td>
						
						<!-- 작성자 --> 
						<td>${board.writer }</td>
						
						<!-- 등록일 -->
						<td>${board.regDate }</td>
						
						<!-- 조회수 -->
						<td class="text-center">${board.cnt }</td>
					</tr>
				</c:forEach>
				
				
			</table>
			<br>
			<div class="d-grid gap-2">
			
			<!-- 새글쓰기 -->
				<a href="newBoard.do" class="btn btn-main btn-lg">
					<spring:message code="message.board.list.link.insertBoard" />
				</a>
			<!-- 새글쓰기 -->
			
			</div>