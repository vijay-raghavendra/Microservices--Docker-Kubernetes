package com.aim2code.practice.SocialMediaApp.ExceptionHandlers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserCustomErrorResponseEntity {

	@ExceptionHandler
	public ResponseEntity<UserCustomErrorResponse> handleUserNotFound(UserCustomExceptionClass ex)
	{
		UserCustomErrorResponse obj = new UserCustomErrorResponse();
		obj.setStatusCode(HttpStatus.BAD_REQUEST.value());
		obj.setDescription(ex.getMessage());
		obj.setLocalDateTime(LocalDateTime.now());		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(obj);
	}
	
	@ExceptionHandler
	public ResponseEntity<UserCustomErrorResponse> handleUserNotFound(Exception ex)
	{
		UserCustomErrorResponse obj = new UserCustomErrorResponse();
		obj.setStatusCode(HttpStatus.BAD_REQUEST.value());
		obj.setDescription(ex.getMessage());
		obj.setLocalDateTime(LocalDateTime.now());		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(obj);
	}
}
