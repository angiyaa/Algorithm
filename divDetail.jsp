<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/script/jquery/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#btnWrap").on("click", "input", function() {
		$("#actionForm").attr("action", $(this).attr("page"));
		
		if($(this).attr("id") == "delBtn") {
			if(confirm("삭제ㄱ?")) {
				$("#actionForm").submit();
			};
		};
		
		$("#actionForm").submit();
	});
});
</script>
</head>
<body>
<form action="#" id="actionForm" method="post" >
	<!-- i/u/d 구분용 -->
	<input type="hidden" name="gbn" value="d" >
	<input type="hidden" name="no" value="${data.DIV_CODE}" >
</form>
분류코드 : ${data.DIV_CODE}<br/>
분류명 : ${data.DIV_NAME}<br/>
<div id="btnWrap">
	<input type="button" value="목록" id="listBtn" page="divList" >
	<input type="button" value="삭제" id="delBtn" page="divAction" >
	<input type="button" value="수정" id="updateBtn" page="divUpdate" >
</div>
</body>
</html>