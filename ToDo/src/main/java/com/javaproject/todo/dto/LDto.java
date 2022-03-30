package com.javaproject.todo.dto;

import java.sql.Timestamp;

public class LDto {
	String uId;
	int lCode;
	String lContent;
	Timestamp lCreatedate;
	Timestamp lFinishdate;
	boolean lisdone;
	boolean lisimportant;
	String user_uId;
	
	public LDto(){
		
	}

	public LDto(String uId, int lCode, String lContent, Timestamp lCreatedate,
			Timestamp lFinishdate, boolean lisdone, boolean lisimportant) {
		super();
		this.uId = uId;
		this.lCode = lCode;
		this.lContent = lContent;
		this.lCreatedate = lCreatedate;
		this.lFinishdate = lFinishdate;
		this.lisdone = lisdone;
		this.lisimportant = lisimportant;
	}

	public LDto(int lCode, String lContent, boolean lisdone,boolean lisimportant) {
		super();
		this.lCode = lCode;
		this.lContent = lContent;
		this.lisdone = lisdone;
		this.lisimportant = lisimportant;
	}



	/**
	 * @param lCode
	 * @param lContent
	 * @param lCreatedate
	 * @param lFinishdate
	 * @param lisdone
	 * @param lisimportant
	 * @param user_uId
	 */
	public LDto(int lCode, String lContent, Timestamp lCreatedate, Timestamp lFinishdate, boolean lisdone,
			boolean lisimportant) {
		super();
		this.lCode = lCode;
		this.lContent = lContent;
		this.lCreatedate = lCreatedate;
		this.lFinishdate = lFinishdate;
		this.lisdone = lisdone;
		this.lisimportant = lisimportant;
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
	 * @return the lisdone
	 */
	public boolean isLisdone() {
		return lisdone;
	}

	/**
	 * @param lisdone the lisdone to set
	 */
	public void setLisdone(boolean lisdone) {
		this.lisdone = lisdone;
	}

	/**
	 * @return the lisimportant
	 */
	public boolean isLisimportant() {
		return lisimportant;
	}

	/**
	 * @param lisimportant the lisimportant to set
	 */
	public void setLisimportant(boolean lisimportant) {
		this.lisimportant = lisimportant;
	}
	
	
	
}
