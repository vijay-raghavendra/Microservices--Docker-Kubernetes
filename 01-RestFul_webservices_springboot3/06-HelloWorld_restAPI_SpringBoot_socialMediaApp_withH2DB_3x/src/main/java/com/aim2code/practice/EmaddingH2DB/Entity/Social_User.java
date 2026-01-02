package com.aim2code.practice.EmaddingH2DB.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="social_user_Details")
public class Social_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_date_time")
	private LocalDateTime dateTime;

	public Social_User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Social_User(String name, LocalDateTime dateTime) {
		super();
		this.name = name;
		this.dateTime = dateTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Social_User [id=" + id + ", name=" + name + ", dateTime=" + dateTime + "]";
	}
	
	

}
