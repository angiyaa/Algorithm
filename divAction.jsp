<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/script/jquery/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	switch("${action}") {
	case "succeed" :
		// 수정할 때
		if("{param.gbn}" == "u") {
			$("#actionForm").submit();
		// 등록/삭제 할 때 
		} else
			location.href = "divList";
		break;
	case "failed" :
		alert("작업 실패");
		break;
	case "error" : 
		alert("작업 실패");
		break;
	};
});

</script>
</head>
<body>
</body>
</html>