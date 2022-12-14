<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>result</title>
</head>
<body>
 <p>
	<span>*** ${sungJukDTO.name} 성적 ***</span>
</p>
 <p>
	<span>총점 :</span>
	<br>
	${sungJukDTO.tot}
</p>
 <p>
	<span>평균 :</span>
	<br>
	${sungJukDTO.avg}
</p>

</body>
</html>