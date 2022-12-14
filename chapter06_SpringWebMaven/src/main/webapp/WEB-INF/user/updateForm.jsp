<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#updateForm div {
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
	<h3>
		<img src="../img/1.jpg" width="100" height="100"
			onclick="location.href='../'" style="cursor: pointer;">정보수정
	</h3>
	<hr>
	<p>
		수정할 아이디 입력 <input type="text" name="searchId" id="searchId" size="30">
		<input type="button" id="searchIdBtn" value="검색">
	</p>
	<div id="resultDiv"></div>
	<div id="updateDiv">
		<form id="updateForm">
			<table border="1" width="400px" cellpadding="1" cellspacing="0">

				<tr>
					<!-- 아이디 -->
					<th>이름</th>
					<!-- 가운데 정렬, 굵게 -->
					<td><input type="text" name="name" id="name" size="30"
						readonly="readonly"></td>
				</tr>

				<tr>
					<!-- 아이디 -->
					<th>아이디</th>
					<!-- 가운데 정렬, 굵게 -->
					<td><input type="text" name="id" id="id" size="30">
						<div id="idDiv"></div></td>
				</tr>

				<tr>
					<!-- 비밀번호 -->
					<th>비밀번호</th>
					<!-- 가운데 정렬, 굵게 -->
					<td><input type="text" name="pwd" id="pwd" size="30">
						<div id="pwdDiv"></div></td>
				</tr>

				<tr>
					<th colspan="2"><input type="button" id="updateBtn" value="수정" />
						<input type="reset" value="취소" id="resetBtn" /></th>
					<!-- colspan 은 병합 -->
				</tr>
			</table>
		</form>
	</div>
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
	<script type="text/javascript" src="../js/update.js"></script>
</body>
</html>