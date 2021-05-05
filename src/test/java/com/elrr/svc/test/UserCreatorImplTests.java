//package com.elrr.svc.test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.elrr.dto.Competency;
//import com.elrr.dto.CourseList;
//import com.elrr.dto.Employment;
//import com.elrr.dto.Organization;
//import com.elrr.dto.Person;
//import com.elrr.dto.Personnel;
//import com.elrr.dto.User;
//import com.elrr.repository.CompetencyRepository;
//import com.elrr.repository.CourseListRepository;
//import com.elrr.repository.EmploymentRepository;
//import com.elrr.repository.OrganizationRepository;
//import com.elrr.repository.PersonalRepository;
//import com.elrr.svc.UserCreatorImpl;
//
//@SpringBootTest
//class  UserCreatorImplTests {
//	@Mock
//	CourseListRepository courseListRepository;
//	@Mock
//	CompetencyRepository competencyListRepository;
//	@Mock
//	PersonalRepository personalRepository;
//	@Mock
//	EmploymentRepository employmentRepository;
//	@Mock
//	OrganizationRepository organizationRepository;
//	@Mock
//	CourseList course;
//	@Mock
//	Competency competency;	
//	@Spy
//	@InjectMocks
//	UserCreatorImpl userCreatorImpl;
//	@Test
//	void UserCreatorImplUserCreatorTests() {
//		User user = new User();
//		User mockUser = new User();
//		List<CourseList> courseList = new ArrayList<>();
//		List<Competency> competencies = new ArrayList<>();
//		Personnel personnel = new Personnel();
//		courseList.add(course);
//		courseList.add(course);
//		courseList.add(course);
//		competencies.add(competency);
//		competencies.add(competency);
//		mockUser.setCompetencyList(competencies);
//		mockUser.setCourseList(courseList);
//		mockUser.setPersonnel(personnel);
//		when(this.courseListRepository.findAll()).thenReturn(courseList);
//		when(this.competencyListRepository.findAll()).thenReturn(competencies);
//		doReturn(personnel).when(userCreatorImpl).setUserPersonnel();
//		user = userCreatorImpl.userCreator();
//		assertEquals(user.toString(), mockUser.toString());
//	}
//	
//	@Test
//	void UserCreatorImplSetUserPersonnel() {
//		Personnel personnel = new Personnel();
//		Personnel mockPersonnel = new Personnel();
//		Optional<Person> personal = Optional.of(new Person());
//		Optional<Organization> organization = Optional.of(new Organization());
//		List<Employment> employment = new ArrayList<>();
//		
//		mockPersonnel.setPersonal(personal.get());
//		mockPersonnel.setOrganization(organization.get());
//		mockPersonnel.setEmployment(employment);
//		when(this.personalRepository.findById(Mockito.anyLong())).thenReturn(personal);
//		when(this.organizationRepository.findById(Mockito.anyLong())).thenReturn(organization);
//		when(this.employmentRepository.findAll()).thenReturn(employment);
//		
//		personnel = userCreatorImpl.setUserPersonnel();
//		assertEquals(personnel.toString(), mockPersonnel.toString());
//	}
//}
