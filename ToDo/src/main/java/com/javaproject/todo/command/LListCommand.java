package com.javaproject.todo.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao;
import com.javaproject.todo.dto.LDto;

public class LListCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		Object uID = session.getAttribute("uId");
		String uId = (String)uID;
		
		String queryName =request.getParameter("query");
		String queryContent =request.getParameter("lContent");
		
		LDao dao = new LDao();
		ArrayList<LDto> dtos = dao.list(uId);
		request.setAttribute("list", dtos);
	}

}
