<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
img{
width: 200px;
height: 260px;
}
</style>
</head>
<body>
<h2>귀여운 이미지</h2>

<img src="/day1prac/resources/imgs/toto.jpg" >
<img src="<%=request.getContextPath()%>/resources/imgs/${data}">
<img src="${pageContext.request.contextPath}/resources/imgs/${data}">
</body>
</html>