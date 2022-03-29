package com.javaproject.todo.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaproject.todo.command.LCommand;
import com.javaproject.todo.command.LSignInCommand;

@WebServlet("*.do")
public class LFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LFrontController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actiondo(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actiondo(request, response);
	}


	private void actiondo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		LCommand command = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {
		case("/signIn.do"):
			command = new LSignInCommand();
			command.execute(request, response);
			
			if(request.getAttribute("uId") == null) {
				viewPage = "signIn.jsp?error=error";
			}else {
				viewPage = "list.do";
			}
			
			break;
			
		case("/list.do"):
			System.out.println("list");
			viewPage = "signIn.jsp";
		}
		
	
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
