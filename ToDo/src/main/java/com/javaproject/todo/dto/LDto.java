package com.javaproject.todo.dto;

import java.sql.Timestamp;

public class LDto {
	String uId;
	int lCode;
	String lContent;
	Timestamp lCreatedate;
	Timestamp lFinishdate;
	boolean lIsdone;
	boolean lIsimportant;
	
	public LDto(){
		
	}

	public LDto(String uId, int lCode, String lContent, Timestamp lCreatedate,
			Timestamp lFinishdate, boolean lIsdone, boolean lIsimportant) {
		super();
		this.uId = uId;
		this.lCode = lCode;
		this.lContent = lContent;
		this.lCreatedate = lCreatedate;
		this.lFinishdate = lFinishdate;
		this.lIsdone = lIsdone;
		this.lIsimportant = lIsimportant;
	}

	/**
	 * @return the uId
	 */
	public String getuId() {
		return uId;
	}

	/**
	 * @param uId the uId to set
	 */
	public void setuId(String uId) {
		this.uId = uId;
	}

	/**
	 * @return the lCode
	 */
	public int getlCode() {
		return lCode;
	}

	/**
	 * @param lCode the lCode to set
	 */
	public void setlCode(int lCode) {
		this.lCode = lCode;
	}

	/**
	 * @return the lContent
	 */
	public String getlContent() {
		return lContent;
	}

	/**
	 * @param lContent the lContent to set
	 */
	public void setlContent(String lContent) {
		this.lContent = lContent;
	}

	/**
	 * @return the lCreatedate
	 */
	public Timestamp getlCreatedate() {
		return lCreatedate;
	}

	/**
	 * @param lCreatedate the lCreatedate to set
	 */
	public void setlCreatedate(Timestamp lCreatedate) {
		this.lCreatedate = lCreatedate;
	}

	/**
	 * @return the lFinishdate
	 */
	public Timestamp getlFinishdate() {
		return lFinishdate;
	}

	/**
	 * @param lFinishdate the lFinishdate to set
	 */
	public void setlFinishdate(Timestamp lFinishdate) {
		this.lFinishdate = lFinishdate;
	}

	/**
	 * @return the lIsdone
	 */
	public boolean islIsdone() {
		return lIsdone;
	}

	/**
	 * @param lIsdone the lIsdone to set
	 */
	public void setlIsdone(boolean lIsdone) {
		this.lIsdone = lIsdone;
	}

	/**
	 * @return the lIsimportant
	 */
	public boolean islIsimportant() {
		return lIsimportant;
	}

	/**
	 * @param lIsimportant the lIsimportant to set
	 */
	public void setlIsimportant(boolean lIsimportant) {
		this.lIsimportant = lIsimportant;
	}
	
	
	
}
