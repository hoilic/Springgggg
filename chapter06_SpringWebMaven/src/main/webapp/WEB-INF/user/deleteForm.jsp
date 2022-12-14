<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<img src="../img/1.jpg" width="100" height="100"
			onclick="location.href='../'" style="cursor: pointer;">회원정보삭제
	</h3>
	<hr>
	<p>
		삭제 할 아이디 입력 <input type="text" name="searchId" id="searchId" size="30">
		<input type="button" id="searchIdBtn" value="검색">
	</p>
	<div id="resultDiv"></div>
<script type="text/javascript"
src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/delete.js"></script>
</body>
</html>