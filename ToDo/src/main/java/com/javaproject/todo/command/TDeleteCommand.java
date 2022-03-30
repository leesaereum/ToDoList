package com.javaproject.todo.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< Updated upstream:ToDo/src/main/java/com/javaproject/todo/command/TDeleteCommand.java
public class TDeleteCommand implements TCommand {
=======
import com.javaproject.todo.dao.LDao;


public class LSignUpCommand implements LCommand {
>>>>>>> Stashed changes:ToDo/src/main/java/com/javaproject/todo/command/LSignUpCommand.java

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String uId = request.getParameter("uId");
		String uPw = request.getParameter("uPw");
		String uName = request.getParameter("uName");
		
		LDao dao = new LDao();
		//test
		dao.signUp(uId, uPw, uName);
	}

}
