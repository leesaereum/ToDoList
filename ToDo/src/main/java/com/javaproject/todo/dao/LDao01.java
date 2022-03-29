package com.javaproject.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javaproject.todo.dto.LDto01;

public class LDao01 {

	DataSource dataSource;

	
	public LDao01() {
		// TODO Auto-generated constructor stub
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
	public ArrayList<LDto01> list() {
		//list
		
			ArrayList<LDto01> dtos = new ArrayList<LDto01>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				String query = "select lCode, lContent, lCreatedate, lFinishdate, lIsdone, lIsimportant, user_uId from list";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int lCode = resultSet.getInt("lCode"); 
					String lContent = resultSet.getString("lContent"); 
					Timestamp lCreatedate = resultSet.getTimestamp("lCreatedate"); 
					Timestamp lFinishdate = resultSet.getTimestamp("lFinishdate"); 
					Boolean lIsdone = resultSet.getBoolean("lIsdone"); 
					Boolean lIsimportant = resultSet.getBoolean("lIsimportant"); 
					String user_uId = resultSet.getString("user_uId"); 
					
					LDto01 dto01 = new LDto01();
					
					dtos.add(dto01);
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
			return dtos;
		} //list end
	
	public void signOut() {
		
	}
}
