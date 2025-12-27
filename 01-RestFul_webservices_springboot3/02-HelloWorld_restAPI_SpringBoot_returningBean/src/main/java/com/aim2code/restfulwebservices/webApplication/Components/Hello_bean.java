package com.aim2code.restfulwebservices.webApplication.Components;

public class Hello_bean {

	private String Message;
	
	public Hello_bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hello_bean(String string) {
		// TODO Auto-generated constructor stub
		Message=string;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "Hello_bean [Message=" + Message + "]";
	}
	
	

}
