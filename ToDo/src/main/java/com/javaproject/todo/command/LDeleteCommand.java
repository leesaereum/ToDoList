package com.javaproject.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao;

public class LDeleteCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		Object uID = session.getAttribute("uId");
		String uId = (String)uID;
		
		
		String lCode = request.getParameter("lCode");
		LDao dao = new LDao();
		dao.delete(lCode);

	}

}
