<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To do List/${LDto.uId }</title>
</head>
<style>
	body, table, tr{
		width: 100%;
	}
	h1{
		color : gray;
	}
	.first{
		border-color : gray;
		border-style : solid;
	}
	.second{
		border-color : gray;
		border-style : double;
		border-top-width : 5px;
	}
	.bottomline{
		position: fixed;
		bottom: 16px;
		left:0;
		width: 100%;
		display:flex;
		justify-content:center;
	}
	
</style>
<script type="text/javascript">
	function NewtoDo() {
		location.href = "create.jsp";
	}
</script>
<body>
	<div>
	<h1 align="center">To do List</h1>
	<input type="button" value="New" onclick="NewtoDo()">
	<hr class="first">
	</div>
	<!--list area -->
	<table border="0">
		<tr>
			<th width="30%" align="center">내용</th>
			<th width="20%" align="center">목표일</th>
			<th width="20%" align="center">수행여부</th>
			<th width="20%" align="center">즐겨찾기</th>
		</tr>
	</table>
	<hr class="second">
	<c:forEach items="${list }" var="dto01">
		<td><a href="content_view.do?lCode=${dto01.lCode }">${dto01.lContent }</td>
		<td>${dto01.lCreatedate }</td>
		<td>${dto01.lFinishdate }</td>
		<td><input type="checkbox" name="lIsimportant">${dto01.lIsdone }</td>
		<td><input type="checkbox" name="lIsdone">${dto01.lIsimportant }</td>
	</c:forEach>
	<!--search area-->
	<div class="bottomline">
		<form action="list.do" method="post">
		<select name = "query">
		<option value = "lContent" selected="selected">내용</option>
		<option value = "lCreatedate">생성일</option>
		<option value = "lFinishdate">목표일</option>
		<option value = "lIsdone">수행여부</option>
		<option value = "lIsimportant">즐겨찾기</option>
	</select>
	<input type="text" name="lContent" size="50">
	<input type="submit" value="검색">
	</form>
	</div>
	
</body>
</html>