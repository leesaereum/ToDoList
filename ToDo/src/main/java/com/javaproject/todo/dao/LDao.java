package com.javaproject.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javaproject.todo.dto.LDto;

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
	public void signIn() {
		
	}
	public void create() {
		
	}
	public void modify() {
		
	}
	public void delete() {
		
	}
	public LDto contentView(String uID) {
		//user value return	
			LDto dto = null;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				String query = "select uId from user";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, uID);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					String uId = resultSet.getString("uId"); 
					
					dto = new LDto(uId);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(resultSet != null) resultSet.close();
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return dto;
		} //end
	
	public void signOut() {
		
	}
}

