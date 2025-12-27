package com.aim2code.restfulwebservices.webApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aim2code.restfulwebservices.webApplication.Components.Hello_bean;

@RestController
@RequestMapping("/api")
public class My_RestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Vijay from RestFul webservices";
	}
	
	@GetMapping("/hello-bean")
	public Hello_bean helloBean() {
		return new Hello_bean("Hello Vijay");
	}

}
