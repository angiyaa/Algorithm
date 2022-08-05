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
	$("#listBtn").on("click", function(){
		$("#actionForm").attr
	});
			
	$("#updateBtn").on("click", function() {
		if($("#divCode").val() == "") {
			alert("코드를 입력해주세요.")
		} else 
			$("#actionForm").submit();	
	});
});

</script>
</head>
<body>
<form action="divAction" id="actionForm" method="post" >
	<input type="hidden" name="gbn" value="u" />
	<input type="hidden" name="no" value="${data.DIV_CODE}" />
	분류코드 : ${data.DIV_CODE}<br/>
	분류명<input type="text" name="divName" id="divName" value="${data.DIV_NAME}" /><br/>
</form>
	<input type="button" value="수정" id="updateBtn" />
	<input type="button" value="돌아가기" id="listBtn" />
</body>
</html>