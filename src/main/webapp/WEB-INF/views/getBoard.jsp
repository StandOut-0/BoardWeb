<%@page contentType="text/html; charset=EUC-KR" isELIgnored="false"%>

<p class="text-end">
	<b class="me-2 small">${userName }</b><a href="logout.do"
		class="btn btn-sm btn-danger">Log-out</a>
</p>

<form action="updateBoard.do" method="post">
	<input name="seq" type="hidden" value="${board.seq}" />
	<table width="700" class="table table-sm border-top">
		<tr>
			<td class="bg-light" width="70">����</td>
			<td align="left"><input name="title" type="text"
				class="form-control form-control-sm whenNotAdmin" value="${board.title }" /></td>
		</tr>
		<tr>
			<td class="bg-light">�ۼ���</td>
			<td align="left"><span class="small">${board.writer }</span></td>
		</tr>
		<tr>
			<td class="bg-light">����</td>
			<td align="left"><textarea name="content" cols="40" rows="10"
					class="form-control form-control-sm whenNotAdmin">
${board.content }</textarea></td>
		</tr>
		<tr>
			<td class="bg-light">�����</td>
			<td align="left"><span class="small">${board.regDate }</span></td>
		</tr>
		<tr>
			<td class="bg-light">��ȸ��</td>
			<td align="left"><span class="small">${board.cnt }</span></td>
		</tr>
	</table>

	<div class="d-grid gap-2 notMatch">
		<input type="submit" value="�� ����" class="btn btn-main " />
	</div>
</form>

	
<div class="mt-2 text-end">
<a class="btn btn-danger notMatch delete" href="deleteBoard.do?seq=${board.seq }">�ۻ���</a>
	<a class="btn btn-light" href="getBoardList.do">�۸��</a> 
</div>

<script>

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
	
	if("${userName}" == "������") {
		let deleteThis = document.querySelector(".delete");
		deleteThis.classList.remove("d-none");
	}
  
</script>

