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
<body>
	<h1 align="center">To do List</h1>
	<hr class="first">
	<!--list area -->
	<table border="0">
		<tr>
			<th width="30%" align="center">내용</th>
			<th width="30%" align="center">목표일</th>
			<th width="25%" align="center">수행여부</th>
			<th width="15%" align="center">중요도</th>
		</tr>
	</table>
	<hr class="second">
	<c:forEach items="${list }" var="dto01">
		<td><a href=".do?lCode=${dto01.lCode }">${dto01.lCode }</a></td>
		<td>${dto01.lContent }</td>
		<td>${dto01.lCreatedate }</td>
		<td>${dto01.lFinishdate }</td>
		<td>${dto01.lIsdone }</td>
		<td>${dto01.lIsimportant }</td>
		<td>${dto01.user_uId }</td>
	</c:forEach>
	<!--search area-->
	<div class="bottomline">
		<form action="list.do" method="post">
		<select name = "query">
		<option value = "lContent" selected="selected">내용</option>
		<option value = "lCreatedate">생성일</option>
		<option value = "lFinishdate">목표일</option>
		<option value = "lIsdone">수행여부</option>
		<option value = "lIsimportant">중요도</option>
	</select>
	<input type="text" name="lContent" size="50">
	<input type="submit" value="검색">
	</form>
	</div>
	
</body>
</html>