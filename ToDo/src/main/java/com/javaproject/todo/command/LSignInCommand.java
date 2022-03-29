package com.javaproject.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao;

public class LSignInCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id = request.getParameter("uId");
		String pw = request.getParameter("uPw");
		LDao dao = new LDao();

		String uId = dao.signIn(id, pw);
		if(uId != null) {
			HttpSession session = request.getSession();
			session.setAttribute("UID", uId);
		}
		System.out.println(uId);
		
		if(uId == null) {
			request.setAttribute("viewPage", "signIn.jsp?error=error");
		}else {
			request.setAttribute("viewPage", "list.do");
		}
		

	}

}
