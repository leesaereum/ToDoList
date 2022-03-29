package com.javaproject.todo.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.dao.LDao01;
import com.javaproject.todo.dto.LDto01;

public class LListCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stubs
		HttpSession session = request.getSession();
		Object uID = session.getAttribute("uId");
		String uId = (String)uID;
		
		String queryName =request.getParameter("query");
		String queryContent =request.getParameter("lContent");
		System.out.println(queryName);
		System.out.println(queryContent);
		
		
		LDao01 dao01 = new LDao01();
		ArrayList<LDto01> dtos =dao01.list(queryName, queryContent, uId);
		request.setAttribute("list", dtos);
	}

}
