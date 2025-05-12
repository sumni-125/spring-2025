<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/form1"  method="get">
		<input type="text" name="id">
		<input type="text" name="pw">
	<button>등록1</button>
	</form>
	<form action="<%=request.getContextPath()%>/form2"  method="post">
		<input type="text" name="id">
		<input type="text" name="pw">
	<button>등록2</button>
	</form>

</body>
</html>