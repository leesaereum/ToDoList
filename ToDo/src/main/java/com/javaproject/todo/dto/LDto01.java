package com.javaproject.todo.dto;

import java.sql.Timestamp;

public class LDto01 {

	int lCode;
	String lContent;
	Timestamp lCreatedate;
	Timestamp lFinishdate;
	boolean lIsdone;
	boolean lIsimportant;
	String user_uId;
	
	
	public LDto01() {
		// TODO Auto-generated constructor stub
	}


	public LDto01(int lCode, String lContent, Timestamp lCreatedate, Timestamp lFinishdate, boolean lIsdone,
			boolean lIsimportant, String user_uId) {
		super();
		this.lCode = lCode;
		this.lContent = lContent;
		this.lCreatedate = lCreatedate;
		this.lFinishdate = lFinishdate;
		this.lIsdone = lIsdone;
		this.lIsimportant = lIsimportant;
		this.user_uId = user_uId;
	}


	public int getlCode() {
		return lCode;
	}


	public void setlCode(int lCode) {
		this.lCode = lCode;
	}


	public String getlContent() {
		return lContent;
	}


	public void setlContent(String lContent) {
		this.lContent = lContent;
	}


	public Timestamp getlCreatedate() {
		return lCreatedate;
	}


	public void setlCreatedate(Timestamp lCreatedate) {
		this.lCreatedate = lCreatedate;
	}


	public Timestamp getlFinishdate() {
		return lFinishdate;
	}


	public void setlFinishdate(Timestamp lFinishdate) {
		this.lFinishdate = lFinishdate;
	}


	public boolean islIsdone() {
		return lIsdone;
	}


	public void setlIsdone(boolean lIsdone) {
		this.lIsdone = lIsdone;
	}


	public boolean islIsimportant() {
		return lIsimportant;
	}


	public void setlIsimportant(boolean lIsimportant) {
		this.lIsimportant = lIsimportant;
	}


	public String getUser_uId() {
		return user_uId;
	}


	public void setUser_uId(String user_uId) {
		this.user_uId = user_uId;
	}

	
}
