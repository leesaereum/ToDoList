package com.javaproject.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao;

public class LSignInCommand implements LCommand {
	
	public static final LSignInCommand instance = new LSignInCommand();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uId = request.getParameter("uId");
		String uPw = request.getParameter("uPw");
		if(uId!=null) uId= uId.trim();
		if(uPw!=null) uPw= uPw.trim();
		LDao dao = new LDao();
		boolean result = dao.signIn(uId, uPw);
		
		if(result) {
			request.setAttribute("viewPage", "list.do?uId="+uId);
			HttpSession session = request.getSession();
			session.setAttribute("uId", uId);
		}else {
			request.setAttribute("viewPage", "signInagain.jsp");
		}
		
	}

}
