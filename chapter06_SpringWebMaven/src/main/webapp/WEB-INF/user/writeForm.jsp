<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

#writeForm div{
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
<h3>
	<img src="../img/1.jpg" width="100" height="100" 
	onclick="location.href='../'" style="cursor:pointer;">회원가입</h3>
<form id="writeForm" >
<table border="1" width="400px" cellpadding="1" cellspacing="0">
		
		<tr> <!-- 아이디 -->
			<th> 이름 </th>	<!-- 가운데 정렬, 굵게 -->	
			<td> 	
					<input type="text" name="name" id="name" size="30"  >
					<div id="nameDiv"></div>		
			 </td>
		</tr >
		
		<tr> <!-- 아이디 -->
			<th> 아이디 </th>	<!-- 가운데 정렬, 굵게 -->	
			<td> 
					<input type="text" name="id" id="id" size="30" >
					<div id="idDiv"></div>		
			 </td>
		</tr >
		
		<tr> <!-- 비밀번호 -->
			<th> 비밀번호 </th>	<!-- 가운데 정렬, 굵게 -->	
			<td> 
					<input type="text" name="pwd" id="pwd" size="30" >
					<div id="pwdDiv"></div>		
			 </td>
		</tr >
		
		<tr>
			<th colspan="2"> 
			<input type="button" id="writeBtn" value="등록"/>
			<input type="button"  value="취소"/>
			</th> <!-- colspan 은 병합 -->
		</tr>		
</table>
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>
</body>
</html>