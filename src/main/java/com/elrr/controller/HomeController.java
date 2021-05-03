package com.elrr.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.elrr.dto.User;
import com.elrr.svc.UserCreatorSvc;

@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:3004","http://localhost:5000"})
@RestController
@RequestMapping("api")
public class HomeController {
	
	@Autowired
	private UserCreatorSvc userCreatorSvc;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, produces = {"application/json"})
	public User getUsers(@RequestParam(required = false) String userName, @RequestParam(required = false) String password) {
		System.out.println(userName +"_"+ password);
		
		User user = new User();
		user = userCreatorSvc.userCreator();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		System.out.println(user.toString());
		return user;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public User redirectUser(String userName,String password, ModelAndView mav) {
		System.out.println(userName +"_"+ password);

		User user = new User();
		user = userCreatorSvc.userCreator();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		System.out.println(user.toString());
		return user;
	}
}
