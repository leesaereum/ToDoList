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
	
	public void signUp(String uId, String uPw, String uName) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "insert into user (uId, uPw, uName) values (?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			preparedStatement.setString(2, uPw);
			preparedStatement.setString(3, uName);

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}

		}

	}//signup
	
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

	} //signIn
	
	public void create(Object user_uId, String content, String isImportant, String isDone) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into list (user_uId, lContent, lisImportant, lisDone) values (?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, (String) user_uId);
			preparedStatement.setString(2, content);
			preparedStatement.setString(3, isImportant);
			preparedStatement.setString(4, isDone);
			
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
	}//Create
	
	public ArrayList<LDto> list(String uId) {
		//list
		
		ArrayList<LDto> dtos = new ArrayList<LDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select lCode, lContent, lisdone, lisimportant from list where user_uId = ? ORDER BY lIsimportant desc";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int lCode = resultSet.getInt("lCode"); 
				String lContent = resultSet.getString("lContent"); 
				String lIsdone = resultSet.getString("lisdone"); 
				String lIsimportant = resultSet.getString("lisimportant"); 
				
				LDto dto01 = new LDto(lCode, lContent, lIsdone, lIsimportant);
				
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
			String query = "select lContent, lIsdone, lIsimportant from list where lCode = ?  ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, lCode);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String lContent = resultSet.getString(1); 
				String lIsdone = resultSet.getString(2); 
				String lIsimportant = resultSet.getString(3); 
				
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
	
	public void modify(String lCode, String lContent, String lisdone, String lisimportant) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;


		try {
			connection = dataSource.getConnection();
			String query = "UPDATE list SET lContent = ?, lisdone =?, lisimportant = ?  Where lCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, lContent);
			preparedStatement.setString(2, lisdone);
			preparedStatement.setString(3, lisimportant);
			preparedStatement.setString(4, lCode);
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
