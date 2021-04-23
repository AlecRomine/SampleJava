package com.deloitte.elrr.svc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.elrr.entity.Competency;
import com.deloitte.elrr.entity.CourseList;
import com.deloitte.elrr.entity.Organization;
import com.deloitte.elrr.entity.Personal;
import com.deloitte.elrr.entity.Personnel;
import com.deloitte.elrr.entity.User;
import com.deloitte.elrr.repository.CompetencyRepository;
import com.deloitte.elrr.repository.CourseListRepository;
import com.deloitte.elrr.repository.EmploymentRepository;
import com.deloitte.elrr.repository.OrganizationRepository;
import com.deloitte.elrr.repository.PersonalRepository;


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
		user.setCompetencyList(competencies);
		user.setPersonnel(setUserPersonnel());
		return user;
	}
	
	public Personnel setUserPersonnel() {
		Personnel personnel = new Personnel();
		Optional<Personal> personal = Optional.of(new Personal());
		Optional<Organization> organization = Optional.of(new Organization());

		personal = this.personalRepository.findById(1L);
		System.out.println(personal.get().toString());
		
		organization = this.organizationRepository.findById(1L);
		System.out.println(organization.get().toString());
		
		personnel.setPersonal(personal.get());
		personnel.setOrganization(organization.get());
		personnel.setEmployment(this.employmentRepository.findAll());
		
		return personnel;
	}
}
