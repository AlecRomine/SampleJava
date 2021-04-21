package com.example.demo.svc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Competency;
import com.example.demo.entity.CourseList;
import com.example.demo.entity.Organization;
import com.example.demo.entity.Personal;
import com.example.demo.entity.Personnel;
import com.example.demo.entity.User;
import com.example.demo.repository.CompetencyRepository;
import com.example.demo.repository.CourseListRepository;
import com.example.demo.repository.EmploymentRepository;
import com.example.demo.repository.OrganizationRepository;
import com.example.demo.repository.PersonalRepository;


@Service
public class UserCreatorImpl implements UserCreatorSvc{
	@Autowired
	private CourseListRepository courseListRepository;
	@Autowired
	private CompetencyRepository competencyListRepository;
	@Autowired
	private PersonalRepository personalRepository;
	@Autowired
	private EmploymentRepository employmentRepository;
	@Autowired
	private OrganizationRepository organizationRepository;
	@Override
	public User userCreator() {
		User user = new User();
		List<CourseList> courseList = this.courseListRepository.findAll();
		List<Competency> competencies = this.competencyListRepository.findAll();
		
		user.setCourseList(courseList);
		user.setcompetencyList(competencies);
		user.setPersonnel(setUserPersonnel());
		return user;
	}
	
	public Personnel setUserPersonnel() {
		Personnel personnel = new Personnel();
		Optional<Personal> personal = Optional.of(new Personal());
		Optional<Organization> organization = Optional.of(new Organization());
		
		personal = this.personalRepository.findById(1L);
		organization = this.organizationRepository.findById(1L);
		personnel.setPersonal(personal.get());
		personnel.setOrganization(organization.get());
		personnel.setEmployment(this.employmentRepository.findAll());
		
		return personnel;
	}
}
