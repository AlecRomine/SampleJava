package com.elrr.svc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elrr.dto.Competency;
import com.elrr.dto.CourseList;
import com.elrr.dto.Organization;
import com.elrr.dto.Personal;
import com.elrr.dto.Personnel;
import com.elrr.dto.User;
import com.elrr.repository.CompetencyRepository;
import com.elrr.repository.CourseListRepository;
import com.elrr.repository.EmploymentRepository;
import com.elrr.repository.OrganizationRepository;
import com.elrr.repository.PersonalRepository;


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

		List<CourseList> courseList = new ArrayList<>();
		courseList.addAll(courseListRepository.findAll());
		List<Competency> competencies = new ArrayList<>();
		competencies.addAll(competencyListRepository.findAll());
		
		List<CourseList> cl1 = new ArrayList<>();
		cl1.add(courseList.get(0));
		List<CourseList> cl2 = new ArrayList<>();
		cl2.add(courseList.get(1));
		cl2.add(courseList.get(2));

		competencies.get(0).setCourseList(cl1);
		competencies.get(1).setCourseList(cl2);
		user.setCourseList(courseList);
		user.setCompetencyList(competencies);
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
		personnel.setEmployment(employmentRepository.findAll());
		
		return personnel;
	}
}
