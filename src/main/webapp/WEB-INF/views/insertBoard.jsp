<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<p class="text-end">
	<b class="me-2 small">${userName }</b><a href="logout.do"
		class="btn btn-sm btn-danger"> <spring:message
			code='message.user.login.logOutBtn' /></a>
</p>

<!-- submit�� insertBoard_proc.jsp��  post ������� ���� ������ �̵���. -->
<form action="insertBoard.do" method="post"
	enctype="multipart/form-data">
	<table width="700" class="table table-sm border-top">
		<tr>
			<td class="bg-light" width="70"><spring:message
					code='message.board.list.table.head.title' /></td>
			<td align="left"><input class="form-control form-control-sm"
				type="text" name="title" /></td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.table.head.writer' /></td>
			<td align="left"><span class="small">${board.writer }</span></td>
		</tr>
		<tr>
			<td class="bg-light"><spring:message
					code='message.board.list.search.condition.content' /></td>
			<td align="left"><textarea class="form-control form-control-sm"
					name="content" cols="40" rows="10"></textarea></td>
		</tr>
		<tr>
			<td class="bg-light" width="70"><spring:message
					code='message.board.list.link.uploade' /></td>
			<td align="left">


				<div class="input-group mb-0">
					<!-- <input type="file" class="form-control mb-0" id="inputGroupFile02" name="uploadFile"> -->

					<!-- ���� �̹��� ���ε� -->
					<!-- filesToFackFilesInput, ���� file input�� placeholder���������� �� ���� ������ hidden, -->
					<!-- label�� ����� input���� file value���� �ݿ��� ����ڿ��� �˸�. -->
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
					<!-- label�� ����� input���� file value���� �ݿ��� ����ڿ��� �˸�. -->
					<!-- ���� �̹��� ���ε� -->


				</div>
		</tr>
	</table>

	<div class="d-grid gap-2 notMatch">
		<input type="submit"
			value="<spring:message code='message.board.list.link.insertBoard' />"
			class="btn btn-main " />
	</div>
</form>

<!-- �ܼ��� ������ �̵� -->
<div class="d-grid gap-2 notMatch">
	<a href="getBoardList.do" class="btn btn-light mt-2"><spring:message
			code='message.board.list.mainTitle' /></a>
</div>



<script>

//�̹��� �̸�üũ
function filesToFackFilesInput(label){
	let file_real = label.children[0];
	let file_fake = label.children[2];
	
	//file input file_real�� change�Ҷ�
	file_real.addEventListener("change", function () {
		console.log("dd");
		//name���� ���� �����̸��� ������ �����Ѵ�.
		let files = this.files[0].name;
		file_fake.value = files;
	});
}

</script>
