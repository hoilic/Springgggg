<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>input</title>
</head>
<body>
<form method="post" action="/chapter06_1/sungJuk/result.do">
	<p>
		<span>이름 :</span>
		<input type="text" name="name">
	
	 <p>
		<span>국어 :</span>
		<input type="text" name="kor">
	</p>
	 <p>
		<span>영어 :</span>
		<input type="text" name="eng">
	</p>
	 <p>
		<span>수학 :</span>
		<input type="text" name="math">
	</p>
	<p>
		<input type="submit" value="계산">
	</p>
</form>

</body>
</html>