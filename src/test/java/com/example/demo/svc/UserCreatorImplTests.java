package com.example.demo.svc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Competency;
import com.example.demo.entity.CourseList;
import com.example.demo.entity.Employment;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Personal;
import com.example.demo.entity.Personnel;
import com.example.demo.entity.User;
import com.example.demo.repository.CompetencyRepository;
import com.example.demo.repository.CourseListRepository;
import com.example.demo.repository.EmploymentRepository;
import com.example.demo.repository.OrganizationRepository;
import com.example.demo.repository.PersonalRepository;

@SpringBootTest
class  UserCreatorImplTests {
	@Mock
	CourseListRepository courseListRepository;
	@Mock
	CompetencyRepository competencyListRepository;
	@Mock
	PersonalRepository personalRepository;
	@Mock
	EmploymentRepository employmentRepository;
	@Mock
	OrganizationRepository organizationRepository;

	@Spy
	@InjectMocks
	UserCreatorImpl userCreatorImpl;
	@Test
	void UserCreatorImplUserCreatorTests() {
		User user = new User();
		User mockUser = new User();
		List<CourseList> courseList = new ArrayList<>();
		List<Competency> competencies = new ArrayList<>();
		Personnel personnel = new Personnel();
		mockUser.setCompetencyList(competencies);
		mockUser.setCourseList(courseList);
		mockUser.setPersonnel(personnel);
		when(this.courseListRepository.findAll()).thenReturn(courseList);
		when(this.competencyListRepository.findAll()).thenReturn(competencies);
		doReturn(personnel).when(userCreatorImpl).setUserPersonnel();
		user = userCreatorImpl.userCreator();
		assertEquals(user.toString(), mockUser.toString());
	}
	
	@Test
	void UserCreatorImplSetUserPersonnel() {
		Personnel personnel = new Personnel();
		Personnel mockPersonnel = new Personnel();
		Optional<Personal> personal = Optional.of(new Personal());
		Optional<Organization> organization = Optional.of(new Organization());
		List<Employment> employment = new ArrayList<>();
		
		mockPersonnel.setPersonal(personal.get());
		mockPersonnel.setOrganization(organization.get());
		mockPersonnel.setEmployment(employment);
		when(this.personalRepository.findById(Mockito.anyLong())).thenReturn(personal);
		when(this.organizationRepository.findById(Mockito.anyLong())).thenReturn(organization);
		when(this.employmentRepository.findAll()).thenReturn(employment);
		
		personnel = userCreatorImpl.setUserPersonnel();
		assertEquals(personnel.toString(), mockPersonnel.toString());
	}
}
