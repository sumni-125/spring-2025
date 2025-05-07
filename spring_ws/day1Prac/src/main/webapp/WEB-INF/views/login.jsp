<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!--form action="<%=request.getContextPath()%>/login" method="post"-->
<form action="<%=request.getContextPath()%>/login2" method="post">
<!--form action="<%=request.getContextPath()%>/login3" method="post"-->
<input type="text" name="id">
<input type="text" name="pw">
<button>login</button>
</form>

</body>
</html>