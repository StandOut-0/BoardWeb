<%@page contentType="text/html; charset=EUC-KR" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<p class="text-end">
	<!-- 사용자명  -->
	<b class="me-2 small">${userName }</b>

	<!-- 로그아웃 버튼 -->
	<a href="logout.do" class="btn btn-sm btn-danger"> <spring:message
			code='message.user.login.logOutBtn' />
	</a>
</p>

<form action="updateBoard.do" method="post">
	<!-- 글번호 -->
	<input name="seq" type="hidden" value="${board.seq}" />


	<table width="700" class="table table-sm border-top">
		<tr>
			<td class="bg-light" width="70"><spring:message
					code='message.board.list.table.head.title' /></td>
			<td align="left">
			
				<!-- 글 제목 --> 
				<input name="title" type="text"
				class="form-control form-control-sm whenNotAdmin"
				value="${board.title }" />
				<!-- 글 제목 -->
				
			</td>

		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.table.head.writer' /></td>

			<td align="left">
			
				<!-- 작성자 --> 
				<span class="small">${board.writer }</span> 
				<!-- 작성자 -->

			</td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.search.condition.content' /></td>
			<td align="left">
			
				<!-- 본문쓰기 --> 
				<textarea name="content" cols="40" rows="10"
					class="form-control form-control-sm whenNotAdmin">
${board.content }</textarea> 
				<!-- 본문쓰기 -->

			</td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.table.head.regDate' /></td>
			<td align="left">
			
			<!-- 등록일 -->
			<span class="small">${board.regDate }</span>
			<!-- 등록일 -->
			
			</td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.table.head.cnt' /></td>
			<td align="left">
			
			<!-- 조회수 -->
			<span class="small">${board.cnt }</span>
			<!-- 조회수 -->
			
			</td>
		</tr>
	</table>

	<div class="d-grid gap-2 notMatch">
	
		<!-- 수정하기 -->
		<input type="submit"
			value="<spring:message code='message.board.list.link.editBoard' />"
			class="btn btn-main " />
		<!-- 수정하기 -->
		
	</div>
</form>


<div class="mt-2 text-end">
	
	<!-- 삭제하기 -->
	<a class="btn btn-danger notMatch delete"
		href="deleteBoard.do?seq=${board.seq }"> <spring:message
			code='message.board.list.link.deleteBoard' />
	</a>
	<!-- 삭제하기 --> 
	
	<!-- 글목록 보기 -->
	<a class="btn btn-light" href="getBoardList.do"> <spring:message
			code='message.board.list.mainTitle' />
	</a>
	<!-- 글목록 보기 -->
	
</div>

<script>

	//작성자와 사용자가 다를때 BTN 숨김
	if("${userName}" !== "${board.writer}") {
	    let disabledAll = document.querySelectorAll(".notMatch");
	    let inputAll = document.querySelectorAll(".whenNotAdmin");
	    disabledAll.forEach(element => {
			element.classList.add("d-none");
		}); 
	    inputAll.forEach(element => {
	    	element.readOnly = true;
	    	});
	  }
	
	//관리자일경우는 모두  SHOW
	if("${userName}" == "관리자") {
		let deleteThis = document.querySelector(".delete");
		deleteThis.classList.remove("d-none");
	}
  
</script>

