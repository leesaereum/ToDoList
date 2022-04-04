package com.javaproject.todo.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao;

public class LModifyCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Object uID = session.getAttribute("uId");
		String uId = (String)uID;
		
		String lCode = request.getParameter("lCode");
		String lContent = request.getParameter("lContent");
		String lisdone = request.getParameter("lisdone");
		String lisimportant = request.getParameter("lisimportant");
		LDao dao = new LDao();
		dao.modify(lCode, lContent, lisdone, lisimportant);
	}

}
