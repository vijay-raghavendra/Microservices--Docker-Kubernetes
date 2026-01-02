package com.aim2code.practice.SocialMediaApp.ExceptionHandlers;

import java.time.LocalDateTime;

public class UserCustomErrorResponse {
	
	private int statusCode;
	
	private String description;
	
	private LocalDateTime localDateTime;

	public UserCustomErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCustomErrorResponse(int statusCode, String description, LocalDateTime localDateTime) {
		super();
		this.statusCode = statusCode;
		this.description = description;
		this.localDateTime = localDateTime;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "UserCustomErrorResponse [statusCode=" + statusCode + ", description=" + description + ", localDateTime="
				+ localDateTime + "]";
	}
	
	

}
