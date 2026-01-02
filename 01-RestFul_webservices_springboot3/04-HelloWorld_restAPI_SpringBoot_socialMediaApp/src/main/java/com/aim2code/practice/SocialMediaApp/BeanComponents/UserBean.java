package com.aim2code.practice.SocialMediaApp.BeanComponents;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserBean {
	
	private Integer userId;
	
	private String name;
	//Time
	private LocalDateTime dateTime;

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(Integer id,String name, LocalDateTime dateTime) {
		super();
		this.userId =id;
		this.name = name;
		this.dateTime = dateTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", Name=" + name + ", DateTime=" + dateTime + "]";
	}
	
	
	
}
