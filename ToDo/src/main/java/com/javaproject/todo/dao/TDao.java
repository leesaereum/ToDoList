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
		//list
		public ArrayList<BDto> list(){
			ArrayList<BDto> dtos = new ArrayList<BDto>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			
			try {
				connection = dataSource.getConnection();
				String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int bId = resultSet.getInt("bId"); //1234로 써도 되고, Column 이름으로 써도 됨!
					String bName = resultSet.getString("bName");
					String bTitle = resultSet.getString("bTitle");
					String bContent = resultSet.getString("bContent");
					Timestamp bDate = resultSet.getTimestamp("bDate");
					
					BDto dto = new BDto(bId, bName, bTitle, bContent, bDate);
					
					dtos.add(dto);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//이상이 있건 없건 메모리 정리	
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
	}
	public void signOut() {
		
	}
}

