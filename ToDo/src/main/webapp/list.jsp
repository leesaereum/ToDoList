<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To do List/${dto.uId }</title>
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
	
	.listcontent{
		width: 100%;
	}
	
</style>
<script type="text/javascript">
	function NewtoDo() {
		location.href = "create.jsp";
	}
</script>
<body>
	<h1 align="center">To do List</h1>
	<input type="button" value="New" onclick="NewtoDo()">
	<hr class="first">
	<!--list area -->
	
	<table border="0">
		<tr>
			<th width="30%" align="center">내용</th>
			<th width="30%" align="center">수행여부</th>
			<th width="30%" align="center">중요도</th>
		</tr>
	</table>
	
	<hr class="second">
	<div class="listcontent" style="overflow-x:hidden;">
	<c:forEach items="${list }" var="dto01">
	<table border="0">
		<td width="30%" align="center"><a href="content_view.do?lCode=${dto01.lCode}">${dto01.lContent }</a></td>
		<td width="30%" align="center">${dto01.lisdone}</td>
		<td width="30%" align="center">${dto01.lisimportant}</td>
		</table>
	</c:forEach>
	</div>
	<!--search area-->
	<div class="bottomline">
		<form action="list.do">
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