package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

import com.example.demo.svc.UserCreatorSvc;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("api")
public class HomeController {
	
	@Autowired
	private UserCreatorSvc userCreatorSvc;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = {"application/json"})
	public User getUsers() {
		User user = new User();
		user = userCreatorSvc.userCreator();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		
		return user;
	}
}
