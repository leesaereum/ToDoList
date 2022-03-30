package com.javaproject.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.javaproject.todo.dao.LDao;
import com.javaproject.todo.dto.LDto;

public class LContentCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String lCode = request.getParameter("lCode");
		LDao dao = new LDao();
		LDto dto = dao.content(lCode);
		request.setAttribute("content", dto);
	}

}
