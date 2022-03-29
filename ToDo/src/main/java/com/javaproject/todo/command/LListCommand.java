package com.javaproject.todo.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaproject.todo.dao.LDao01;
import com.javaproject.todo.dto.LDto01;

public class LListCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stubs
		LDao01 dao01 = new LDao01();
		ArrayList<LDto01> dtos =dao01.list();
		request.setAttribute("list", dtos);
	}

}
