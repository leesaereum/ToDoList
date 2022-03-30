<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>해당 데이터를 삭제하시겠습니까?</h2>
<form action="delete.do">
<input type="text" name="lCode" value="${lCode}" readonly="readonly">
<input type="submit" value="삭제">
</form>
<form action="cotent_view.do">
<input type="text" name="lCode" value="${lCode}" readonly="readonly">
<input type="submit" value="되돌아가기">
</form>
</body>
</html>