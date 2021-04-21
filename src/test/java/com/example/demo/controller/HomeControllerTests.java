package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CourseList;
import com.example.demo.entity.User;
import com.example.demo.repository.CourseListRepository;

@SpringBootTest
class HomeControllerTests {

	@Test
	void HomeControllerGetUsersTests() {
		HomeController homeController = new HomeController();
		CourseListRepository courseListRepository = null;
		User user = new User();
		List<CourseList> courseList = new ArrayList<>(); 
		CourseList course = new CourseList();
		course.setAwardDate("01/10/2021");
		course.setcourseID("ABC 123");
		course.setCourseName("Start Begin");
		course.setEndDate("01/10/2021");
		course.setExpirationDate("01/10/2023");
		course.setProviderName("USAF");
		course.setStartDate("01/01/2021");
		course.setStatus("Completed");
		courseList.add(course);
		User mockUser = new User(courseList);
		user = homeController.getUsers();
		when(courseListRepository.findAll()).thenReturn(courseList);
		System.out.println(user);
		System.out.println(mockUser);
		assert(user.equals(mockUser));
	}
}
