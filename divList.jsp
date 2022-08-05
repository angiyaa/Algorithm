<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
   border-collapse : collapse;
}
th, td{
   border : 1px solid #000;
   padding : 5px;
}
</style>
<script type="text/javascript" src="resources/script/jquery/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("tbody").on("click", "tr", function() {
		$("#no").val($(this).attr("no"));
		$("#actionForm").submit();
	});
	
	$("#insertBtn").on("click", function() {
		location.href = "divInsert";
	});
});
</script>
</head>
<body>
<form action="divDetail" id="actionForm" method="post" >
	<input type="hidden" id="no" name="no" />
	<input type="hidden" name="gbn" value="i" />
</form>
<input type="button" value="추가" id="insertBtn" />
<table>
   <thead>
      <tr>
         <th>분류코드</th>
         <th>분류명</th>
      </tr>
   </thead>
   <tbody>
      <c:forEach var="data" items="${list}">
      	<tr no="${data.DIV_CODE}">
      		<td>${data.DIV_CODE}</td>
      		<td>${data.DIV_NAME}</td>
      	</tr>
      </c:forEach>
   </tbody>
</table>
</body>
</html>