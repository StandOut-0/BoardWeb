<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<p class="text-end">
	<!-- 사용자명  -->
	<b class="me-2 small">${userName }</b>

	<!-- 로그아웃 버튼 -->
	<a href="logout.do" class="btn btn-sm btn-danger"> <spring:message
			code='message.user.login.logOutBtn' />
	</a>
</p>



<!-- submit시 insertBoard_proc.jsp로  post 방식으로 값을 가지고 이동됨. -->
<form action="insertBoard.do" method="post"
	enctype="multipart/form-data">
	<table width="700" class="table table-sm border-top">
		<tr>
			<td class="bg-light" width="70"><spring:message
					code='message.board.list.table.head.title' /></td>
			<td align="left">
			
			<!-- 글제목 -->
			<input class="form-control form-control-sm"
				type="text" name="title" />
			<!-- 글제목 -->
				
				</td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.table.head.writer' /></td>
			<td align="left">
			
			<!-- 작성자 readonly, 사용자이름으로 자동저장 -->
			<input class="form-control form-control-sm" value="${userName }" readonly
				type="text" name="writer" />
			<!-- 작성자 readonly, 사용자이름으로 자동저장 -->
				
			</td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.search.condition.content' /></td>
			<td align="left">
			
			<!-- 본문쓰기 -->
			<textarea class="form-control form-control-sm"
					name="content" cols="40" rows="10"></textarea>
			<!-- 본문쓰기 -->
					
					</td>
		</tr>
		<tr>
			<td class="bg-light" width="70"><spring:message
					code='message.board.list.link.uploade' /></td>
			<td align="left">


				<div class="input-group mb-0">
					<!-- <input type="file" class="form-control mb-0" id="inputGroupFile02" name="uploadFile"> -->

					<!-- 메인 이미지 업로드 -->
					<!-- filesToFackFilesInput, 본래 file input은 placeholder등을지정할 수 없는 이유로 hidden, -->
					<!-- label로 연결된 input으로 file value값을 반영해 사용자에게 알림. -->
					<label onClick="filesToFackFilesInput(this)"
						class="d-flex w-100 filesToFackFilesInput"> <input
						name='uploadFile' class="file_real d-none" id="f_main_image"
						type="file" style="opacity: .5"> <span class="bg-light btn border rounded-0 rounded-start small" style="width: 120px;">
						<spring:message code='message.board.list.link.selectFile' />
						</span> <input
						name='main_image_fake' class="file_fake form-control rounded-0"
						type="text" placeholder="<spring:message code='message.board.list.link.filePlaceholder' />" readonly
						tabindex="-1">

					</label>
					<!-- label로 연결된 input으로 file value값을 반영해 사용자에게 알림. -->
					<!-- 메인 이미지 업로드 -->


				</div>
		</tr>
	</table>

	<div class="d-grid gap-2 notMatch">
	
	<!-- 새글쓰기 -->
		<input type="submit"
			value="<spring:message code='message.board.list.link.insertBoard' />"
			class="btn btn-main " />
		<!-- 새글쓰기 -->
		
	</div>
</form>





<div class="d-grid gap-2 notMatch">

<!-- 글 목록 보기 -->
	<a href="getBoardList.do" class="btn btn-light mt-2"><spring:message
			code='message.board.list.mainTitle' /></a>
<!-- 글 목록 보기 -->
			
</div>



<script>

//이미지 이름체크
function filesToFackFilesInput(label){
	let file_real = label.children[0];
	let file_fake = label.children[2];
	
	//file input file_real이 change할때
	file_real.addEventListener("change", function () {
		console.log("dd");
		//name값에 따른 파일이름을 가져와 대조한다.
		let files = this.files[0].name;
		file_fake.value = files;
	});
}

</script>
