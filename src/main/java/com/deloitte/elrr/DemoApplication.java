package com.deloitte.elrr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deloitte.elrr.entity.Competency;
import com.deloitte.elrr.entity.CourseList;
import com.deloitte.elrr.entity.Employment;
import com.deloitte.elrr.entity.Organization;
import com.deloitte.elrr.entity.Personal;
import com.deloitte.elrr.repository.CompetencyRepository;
import com.deloitte.elrr.repository.CourseListRepository;
import com.deloitte.elrr.repository.EmploymentRepository;
import com.deloitte.elrr.repository.OrganizationRepository;
import com.deloitte.elrr.repository.PersonalRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

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
    public void run(String...args) throws Exception {
	/*
    	List<CourseList> c1 = new ArrayList<>();
    	List<CourseList> c2 = new ArrayList<>();
    	c1.add(new CourseList("ACQ","Acquisition Management","USAF","01/01/2021","03/31/2021","","","Enrolled"));
    	this.courseListRepository.save(c1.get(0));
    	c2.add(new CourseList("CON 091","Contracting Fundamentals","DAU","09/01/2020","12/20/2020","12/20/2020","12/20/2022","Complete"));
    	c2.add(new CourseList("CON 100","Shaping Smart Business Arrangements","DAU","09/01/2020","12/20/2020","12/20/2020","12/20/2022","Complete"));
    	this.courseListRepository.save(new CourseList("CTC 103","Cyber Awareness","USAF","01/01/2021","03/31/2021","","","Enrolled"));
    	this.courseListRepository.save(c2.get(0));
    	this.courseListRepository.save(c2.get(1));
    	this.courseListRepository.save(new CourseList("CTC 101","Protecting Sensitive Information","USAF","01/01/2020","01/07/2021","01/07/2020","01/07/2022","Complete"));
    	this.competencyListRepository.save(new Competency(0, "Skills and Roles: Business Skills and Acumen ", "Intermediate", c1, "", ""));
    	this.competencyListRepository.save(new Competency(1, "Contract Principles: General Contracting Concepts ", "Intermediate", c2, "/static/media/badge_services_Marked.4aa185ba.png", "12/20/2020"));
    	this.employmentRepository.save(new Employment("Air Force","12/14/2019", "boolean(T/F)", "DoD Air Force Acquisitions", "", "Acquisition Manager","12/07/2019",  "Manager of Team Acquisitions"));
    	this.employmentRepository.save(new Employment("Air Force", "12/14/2018", "boolean(T/F)", "DoD Air Force Acquisitions", "12/14/2019", "Acquisition Manager","12/07/2018", "Jr. Manager of Team Acquisitions"));
    	this.organizationRepository.save(new Organization("AETC", "", "Air Force", "Lorem Ipsum", "D0DAF", "00001234567", "Yes", "01/01/2000", "G0V4", "D0D Air Force", "Lorem Ipsum", "XX/XX/XXXX"));*/
    }
}
