<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/uploadMulti" method="post"
		enctype="multipart/form-data">

		이름:<input type="text" name="goodsName"> <br>
		<input type="file" name="files"> <br>
		<input type="file" name="files"><br>
		<button>등록</button>

	</form>
</body>
</html>