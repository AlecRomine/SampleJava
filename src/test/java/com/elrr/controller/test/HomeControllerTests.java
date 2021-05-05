//package com.elrr.controller.test;
//
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.elrr.controller.HomeController;
//import com.elrr.dto.Competency;
//import com.elrr.dto.CourseList;
//import com.elrr.dto.Personnel;
//import com.elrr.dto.User;
//import com.elrr.svc.UserCreatorSvc;
//
//@SpringBootTest
//class HomeControllerTests {
//
//	@Mock
//	UserCreatorSvc userCreatorSvc;
//	@InjectMocks
//	HomeController homeController;
//	
//	@Test
//	void HomeControllerGetUsersTests() {
//		User user = new User();
//		Personnel personnel= new Personnel();
//		List<CourseList> courseList = new ArrayList<>();
//		List<Competency> competencies = new ArrayList<>();
//		User mockUser = new User();
//		mockUser.setPersonnel(personnel);
//		mockUser.setCourseList(courseList);
//		mockUser.setCompetencyList(competencies);
//		when(userCreatorSvc.userCreator()).thenReturn(mockUser);
//		user = homeController.getUsers("","");
//		assert(user.equals(mockUser));
//	}
//}
