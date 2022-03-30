package com.javaproject.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

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
	public boolean signIn(String uId, String inputuPw) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean result = false;

		try {
			connection = dataSource.getConnection();
			String query = "SELECT uPw from user where uId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				String uPw = resultSet.getString("uPw");
				if(uPw.equals(inputuPw)) result = true;
				else result = false;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;

	}//SignIn
	
	public void create(Object user_uId, String content, String isImportant) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into list (user_uId, lContent, lisImportant, insertDate) values (?, ?, ?, now())";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, (String) user_uId);
			preparedStatement.setString(2, content);
			preparedStatement.setString(3, isImportant);
			
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	public ArrayList<LDto> list(String queryName, String queryContent, String uId) {
		//list
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select lCode, lContent, lCreatedate, lFinishdate, lIsdone, lIsimportant from list where user_uId = ?";
			if(queryContent !=null ) {
				query += "and " + queryName + " like '%" + queryContent + "%'";
			   }
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int lCode = resultSet.getInt("lCode"); 
				String lContent = resultSet.getString("lContent"); 
				Timestamp lCreatedate = resultSet.getTimestamp("lCreatedate"); 
				Timestamp lFinishdate = resultSet.getTimestamp("lFinishdate"); 
				Boolean lIsdone = resultSet.getBoolean("lIsdone"); 
				Boolean lIsimportant = resultSet.getBoolean("lIsimportant"); 
				String user_uId = resultSet.getString("user_uId"); 
				
				LDto01 dto01 = new LDto01(lCode, lContent, lCreatedate, lFinishdate, lIsdone, lIsimportant, user_uId);
				
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
	
	public LDto content(String lCode) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		LDto dto = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select lContent, lIsdone, lIsimportant from list where lCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, lCode);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String lContent = resultSet.getString(1); 
				//Timestamp lCreatedate = resultSet.getTimestamp(2); 
				//Timestamp lFinishdate = resultSet.getTimestamp(3); 
				Boolean lIsdone = resultSet.getBoolean(2); 
				Boolean lIsimportant = resultSet.getBoolean(3); 
				
				dto = new LDto(Integer.parseInt(lCode), lContent, lIsdone, lIsimportant);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}//content
	
	public void modify(String lCode, String lContent, Boolean lisdone, Boolean lisimportant) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;


		try {
			connection = dataSource.getConnection();
			//String query = "UPDATE list SET lContent = ?, lisdone =?, lisimportant = ?  Where lCode = ?";
			String query = "UPDATE list SET lContent = ? Where lCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, lContent);
			//preparedStatement.setBoolean(2, lisdone);
			//preparedStatement.setBoolean(3, lisimportant);
			preparedStatement.setInt(2, Integer.parseInt(lCode));
			preparedStatement.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {

				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//modify
	
	public void delete(String lCode) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "DELETE FROM list WHERE lCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, lCode);
			preparedStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//delete
}
