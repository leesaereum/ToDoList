package com.javaproject.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TListCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stubs
		BDao dao = new BDao();
		ArrayList<BDto> dtos =dao.list();
		request.setAttribute("list", dtos);
	}

}
