package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.CourseList;
import com.example.demo.entity.Personal;
import com.example.demo.entity.Personnel;
import com.example.demo.entity.User;
import com.example.demo.repository.CourseListRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
    private UserRepository userRepository;
	@Autowired
    private CourseListRepository courseListRepository;
    @Override
    public void run(String...args) throws Exception {
    	this.courseListRepository.save(new CourseList("CTC 103","Cyber Awareness","USAF","01/01/2021","03/31/2021","","","Enrolled"));
    	this.courseListRepository.save(new CourseList("ACQ","Acquisition Management","USAF","01/01/2021","03/31/2021","","","Enrolled"));
    	this.courseListRepository.save(new CourseList("CON 091","Contracting Fundamentals","DAU","09/01/2020","12/20/2020","12/20/202","12/20/2022","Complete"));
    	this.courseListRepository.save(new CourseList("CON 100","Shaping Smart Business Arrangements","DAU","09/01/2020","12/20/2020","12/20/202","12/20/2022","Complete"));
    	this.courseListRepository.save(new CourseList("CTC 101","Protecting Sensitive Information","USAF","01/01/2020","01/07/2021","01/07/2020","01/07/2022","Complete"));
//        new User( new Personnel (this.userRepository.save(new Personal(
//        		"Alice Beth Smith", "Alice Smith","","","","","Smith","0987654321","1234567890","(480) 555-1234","Yes","July 4, 1985","alice.smith@us.af.mil",
//        		"Organization","American Citizen","Y","F","English","Smith S. Smithson (480) 555-1234","123 Taft St, Crystal City, VA 22201","Apartment 205"))));
//        new User( new Personnel (this.userRepository.save(new Personal(
//        		"Alice Beth Smith", "Alice Smith","","","","","Smith","0987654321","1234567890","(480) 555-1234","Yes","July 4, 1985","alice.smith@us.af.mil",
//        		"Organization","American Citizen","Y","F","English","Smith S. Smithson (480) 555-1234","123 Taft St, Crystal City, VA 22201","Apartment 205"))));
//        new User( new Personnel (this.userRepository.save(new Personal(
//        		"Alice Beth Smith", "Alice Smith","","","","","Smith","0987654321","1234567890","(480) 555-1234","Yes","July 4, 1985","alice.smith@us.af.mil",
//        		"Organization","American Citizen","Y","F","English","Smith S. Smithson (480) 555-1234","123 Taft St, Crystal City, VA 22201","Apartment 205"))));
    }
}
