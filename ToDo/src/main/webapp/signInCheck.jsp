<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getAttribute("uId") == null){
		request.setAttribute("ERR", "uIdNull");
		RequestDispatcher rd = request.getRequestDispatcher("signIn.jsp");
		rd.forward(request, response);
	}else{
		session.setAttribute("UID", (String)request.getAttribute("uId"));
		RequestDispatcher rd = request.getRequestDispatcher("list.do");
	}
%>