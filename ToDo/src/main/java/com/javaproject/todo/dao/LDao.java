package com.javaproject.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class LDao {
	DataSource dataSource;

	public LDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/todo");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void signUp() {
		
	}
	public String signIn(String id, String pw) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String uId = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select uId from user where uId = ? AND uPw = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pw);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				uId = resultSet.getString("uId");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//이상이 있건 없건 메모리 정리	
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

		return uId;
		
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
