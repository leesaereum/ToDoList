<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 성공</h1>
<c:if test="${uId != null }">
${uId} 로 로그인되었습니다.
</c:if>
<br>
<form action="signOut.do" method="post">
<input type="submit" value="로그아웃">
</form>
</body>
</html>