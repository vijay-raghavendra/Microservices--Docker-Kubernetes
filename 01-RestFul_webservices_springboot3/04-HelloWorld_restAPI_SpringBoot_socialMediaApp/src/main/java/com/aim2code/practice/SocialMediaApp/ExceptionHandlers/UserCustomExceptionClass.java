package com.aim2code.practice.SocialMediaApp.ExceptionHandlers;

public class UserCustomExceptionClass extends Exception{
	
	public UserCustomExceptionClass()
	{
		super();
	}
	
	public UserCustomExceptionClass(String message)
	{
		super(message);
	}
	
	public UserCustomExceptionClass(String message,Throwable th)
	{
		super(message,th);
	}
}
