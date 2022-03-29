package com.javaproject.todo.dto;


public class LDto {
	String uId;
//	String uPw;
//	String uName;
	
	public LDto(){
		
	}
	public LDto(String uId) {
		super();
		this.uId = uId;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}

	
}

