package com.javaproject.todo.command;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao;

public class LCreateCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		
		Object user_uId = session.getAttribute("uId");
		String content = request.getParameter("content");
		String isImportant =  request.getParameter("isImportant");
		String isDone = request.getParameter("isDone");
		
		LDao dao = new LDao();
		
		dao.create(user_uId, content, isImportant, isDone);

}
}

