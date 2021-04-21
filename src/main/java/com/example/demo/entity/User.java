package com.example.demo.entity;

import java.util.List;

public class User {


	private Personnel personnel;
	private List<CourseList> courseList;
	private List<Competency> competencyList;
	public User() {

    }
	public User(List<CourseList> courseList,List<Competency> competencyList,Personnel personnel) {
		super();
		this.courseList = courseList;
		this.competencyList = competencyList;
		this.personnel =personnel;
	}
	public Personnel getPersonnel() {
		return personnel;
	}
	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}
	public List<CourseList> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseList> courseList) {
		this.courseList = courseList;
	}
	public List<Competency> getcompetencyList() {
		return competencyList;
	}
	public void setcompetencyList(List<Competency> competencyList) {
		this.competencyList = competencyList;
	}
}
