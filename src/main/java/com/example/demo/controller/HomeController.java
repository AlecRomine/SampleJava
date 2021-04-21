package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CourseList;
import com.example.demo.entity.Personal;
import com.example.demo.entity.Personnel;
import com.example.demo.entity.User;
import com.example.demo.repository.CourseListRepository;
import com.example.demo.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("api")
public class HomeController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CourseListRepository courseListRepository;
	
	@RequestMapping(value = "/courseList", method = RequestMethod.GET, produces = {"application/json"})
	public User getUsers() {
		User user = new User();
		List<CourseList> courseList = new ArrayList<>();
		courseList = this.courseListRepository.findAll();
		user.setCourseList(courseList);
		return user;
	}
	
//	@RequestMapping(value = "/react", method = RequestMethod.GET, produces = {"application/json"})
//    public List <User> getUsers2() {
//		return this.userRepository.findAll();
//    }
}
