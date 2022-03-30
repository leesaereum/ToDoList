package com.javaproject.todo.dto;


public class LDto {
	String uId;
	int lCode;
	String lContent;
	String lisdone;
	String lisimportant;
	String user_uId;
	
	public LDto(){
		
	}

	/**
	 * @param lCode
	 * @param lContent
	 * @param lisdone
	 * @param lisimportant
	 * @param user_uId
	 */
	public LDto(int lCode, String lContent, String lisdone, String lisimportant, String user_uId) {
		super();
		this.lCode = lCode;
		this.lContent = lContent;
		this.lisdone = lisdone;
		this.lisimportant = lisimportant;
		this.user_uId = user_uId;
	}

	/**
	 * @param lCode
	 * @param lContent
	 * @param lisdone
	 * @param lisimportant
	 */
	public LDto(int lCode, String lContent, String lisdone, String lisimportant) {
		super();
		this.lCode = lCode;
		this.lContent = lContent;
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
	 * @return the lisdone
	 */
	public String getLisdone() {
		return lisdone;
	}

	/**
	 * @param lisdone the lisdone to set
	 */
	public void setLisdone(String lisdone) {
		this.lisdone = lisdone;
	}

	/**
	 * @return the lisimportant
	 */
	public String getLisimportant() {
		return lisimportant;
	}

	/**
	 * @param lisimportant the lisimportant to set
	 */
	public void setLisimportant(String lisimportant) {
		this.lisimportant = lisimportant;
	}

	/**
	 * @return the user_uId
	 */
	public String getUser_uId() {
		return user_uId;
	}

	/**
	 * @param user_uId the user_uId to set
	 */
	public void setUser_uId(String user_uId) {
		this.user_uId = user_uId;
	}
	
	
}