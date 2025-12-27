package com.aim2code.restfulwebservices.webApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class My_RestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Vijay from RestFul webservices";
	}

}
