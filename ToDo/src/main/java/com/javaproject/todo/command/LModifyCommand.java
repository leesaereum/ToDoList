package com.javaproject.todo.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaproject.todo.dao.LDao;

public class LModifyCommand implements LCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String lCode = request.getParameter("lCode");
		String lContent = request.getParameter("lContent");
		//Timestamp lCreatedate = (Timestamp) df.parse(request.getParameter("lCreateDate"));
		//Timestamp lFinishdate = (Timestamp) df.parse(request.getParameter("lFinishDate"));
		String isdone = request.getParameter("lisdone");
		boolean lisdone  = false;
		if(isdone.equals("1")) lisdone=true;
		String isimportant = request.getParameter("lisimportant");
		boolean lisimportant  = false;
		if(isimportant.equals("1")) lisdone=true;
		LDao dao = new LDao();
		dao.modify(lCode, lContent, lisdone, lisimportant);
	}

}
