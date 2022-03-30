package com.javaproject.todo.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaproject.todo.command.LCommand;
import com.javaproject.todo.command.LContentCommand;
import com.javaproject.todo.command.LCreateCommand;
import com.javaproject.todo.command.LDeleteCommand;
import com.javaproject.todo.command.LListCommand;
import com.javaproject.todo.command.LModifyCommand;
import com.javaproject.todo.command.LSignInCommand;
import com.javaproject.todo.command.LSignoutCommand;

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
		case("/list.do"):
			command = new LListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
			
		case("/signIn.do"):
			command = new LSignInCommand();
			command.execute(request, response);
			viewPage = (String) request.getAttribute("viewPage");
			HttpSession session = request.getSession();
			String uId = (String) session.getAttribute("uId");
			session.setAttribute("uId",uId);
			break;
			
		case("/signOut.do"):
			command = new LSignoutCommand();
			command.execute(request, response);
			viewPage="signIn.jsp";
			break;
			
		case("/create.do"):
			viewPage = "create.jsp";
			break;
			
		case("/create_list.do"):
			command = new LCreateCommand();
			command.execute(request, response);
			viewPage = "list.do"; 
			break;
			
		case("/content_view.do"):
			command = new LContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
			break;
			
		case("/modify.do"):
			command = new LModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
			
		case("/delete.do"):
			command = new LDeleteCommand();
			command.execute(request, response);
			viewPage = "delete_sucess.jsp";
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
