<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="<%= request.getContextPath() %>/upload2" method="post" enctype="multipart/form-data">
	
	<input type="text" name="goodsName">
	<input type="file" name="file">
	<button>등록하기</button>
	</form>
	
</body>
</html>