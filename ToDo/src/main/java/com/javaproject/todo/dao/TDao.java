package com.javaproject.todo.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TDao {
	DataSource dataSource;

	public TDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/todo");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void signUp() {
		
	}
	public void signIn() {
		
	}
	public void create() {
		
	}
	public void modify() {
		
	}
	public void delete() {
		
	}
	public void list() {
		
	}
	public void signOut() {
		
	}
}
