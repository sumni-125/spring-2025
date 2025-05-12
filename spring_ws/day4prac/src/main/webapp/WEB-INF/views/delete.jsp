<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function delete1() {
		let id = $("#id").val();
		console.log(id);

		$.ajax({
			type : "DELETE",
			url : "/prac4/members/" + id,
			success : function(data) {
				console.log(data);
			},
			error : function(err) {
				console.log(err);
			}
		});

	}
</script>

</head>
<body>
	<input type="text" id="id">
	<button onclick="delete1()">삭제하기</button>
</body>
</html>