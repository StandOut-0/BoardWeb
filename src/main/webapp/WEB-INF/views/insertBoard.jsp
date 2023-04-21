<%@page contentType="text/html; charset=EUC-KR"%>
<p class="text-end">
	<b class="me-2 small">${userName }</b><a href="logout.do"
		class="btn btn-sm btn-danger">Log-out</a>
</p>

		<!-- submit시 insertBoard_proc.jsp로  post 방식으로 값을 가지고 이동됨. -->
		<form action="insertBoard.do" method="post" enctype="multipart/form-data">
			<table width="700" class="table table-sm border-top">
				<tr>
					<td class="bg-light" width="70">제목</td>
					<td align="left"><input class="form-control form-control-sm" type="text" name="title" /></td>
				</tr>
				<tr>
					<td class="bg-light">작성자</td>
					<td align="left"><span class="small">${board.writer }</span></td>
				</tr>
				<tr>
					<td class="bg-light">내용</td>
					<td align="left"><textarea class="form-control form-control-sm" name="content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td class="bg-light" width="70">업로드</td><td align="left">
					
					
<div class="input-group mb-0">
  <input type="file" class="form-control mb-0" id="inputGroupFile02" name="uploadFile">
</div>
				</tr>
			</table>
			
				<div class="d-grid gap-2 notMatch">
		<input type="submit" value="새글 등록" class="btn btn-main " />
	</div>
		</form>
		
		<!-- 단순한 페이지 이동 -->
		<div class="d-grid gap-2 notMatch">
		<a href="getBoardList.do" class="btn btn-light mt-2">글 목록 가기</a>
		</div>
