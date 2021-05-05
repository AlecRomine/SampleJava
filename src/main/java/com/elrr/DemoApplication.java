package com.elrr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elrr.dto.Competency;
import com.elrr.dto.CourseList;
import com.elrr.dto.Employment;
import com.elrr.dto.Organization;
import com.elrr.dto.Person;

@SpringBootApplication
public class DemoApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
