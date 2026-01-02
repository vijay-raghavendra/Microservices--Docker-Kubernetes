package com.aim2code.practice.SocialMediaApp.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aim2code.practice.SocialMediaApp.BeanComponents.UserBean;
import com.aim2code.practice.SocialMediaApp.Services.SocialMedia_CrudServices;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/user")
public class BasicRestController {
	
	private SocialMedia_CrudServices socialMediaServices;
	
	@Autowired
	public BasicRestController(SocialMedia_CrudServices socialMediaServices)
	{
		this.socialMediaServices = socialMediaServices;
	}
	
	@GetMapping("/getDetails")
	public List<UserBean> details()
	{
		return socialMediaServices.getAllUserDetails();
	}
	
	@GetMapping("/getDetails/{id}")
	public UserBean indiDetails(@PathVariable int id)
	{
		return socialMediaServices.getIndividualUserDetails(id);
	}
	
	@PostMapping("/create")
	public UserBean CreateUser(@RequestBody UserBean user)
	{
		return socialMediaServices.CreateUser(user);
		
	}

	@PutMapping("/update")
	public UserBean updateUser(@RequestBody UserBean user)
	{
		return socialMediaServices.updateUser(user);
		
	}
	
	@PatchMapping("/update/{id}")
	public UserBean updateUserN(@RequestBody UserBean user,@PathVariable int id)
	{
		return socialMediaServices.updateUser(user,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return socialMediaServices.DeleteUser(id);
	}
}
