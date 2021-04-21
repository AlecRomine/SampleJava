package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class User {


//	private Personnel personnel;
	private List<CourseList> courseList;
	public User() {

    }
	public User(List<CourseList> courseList) {
		super();
		this.courseList = courseList;
	}
//    public User(Personnel personnel) {
//        super();
//        this.personnel = personnel;
//    }
//	public Personnel getPersonnel() {
//		return personnel;
//	}
//
//	public void setPersonnel(Personnel personnel) {
//		this.personnel = personnel;
//	}
	public List<CourseList> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseList> courseList) {
		this.courseList = courseList;
	}
}
