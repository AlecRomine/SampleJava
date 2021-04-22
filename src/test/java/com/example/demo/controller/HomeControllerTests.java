package com.example.demo.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Competency;
import com.example.demo.entity.CourseList;
import com.example.demo.entity.Personnel;
import com.example.demo.entity.User;
import com.example.demo.svc.UserCreatorSvc;

@SpringBootTest
class HomeControllerTests {

	@Mock
	UserCreatorSvc userCreatorSvc;
	@InjectMocks
	HomeController homeController;
	
	@Test
	void HomeControllerGetUsersTests() {
		User user = new User();
		Personnel personnel= new Personnel();
		List<CourseList> courseList = new ArrayList<>();
		List<Competency> competencies = new ArrayList<>();
		User mockUser = new User();
		mockUser.setPersonnel(personnel);
		mockUser.setCourseList(courseList);
		mockUser.setCompetencyList(competencies);
		when(userCreatorSvc.userCreator()).thenReturn(mockUser);
		user = homeController.getUsers();
		assert(user.equals(mockUser));
	}
}
