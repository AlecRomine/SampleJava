package com.elrr.dto;

import java.util.List;

public class User {


	private Personnel personnel;
	private List<CourseList> courses;
	private List<Competency> competencies;
	private ContactInformation contactinformation;
	public User() {

    }
	public User(List<CourseList> courses,List<Competency> competencies,Personnel personnel,ContactInformation contactinformation) {
		super();
		this.contactinformation = contactinformation;
		this.courses = courses;
		this.competencies = competencies;
		this.personnel =personnel;
	}
	public Personnel getPersonnel() {
		return personnel;
	}
	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}
	public List<CourseList> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseList> courseList) {
		this.courses = courseList;
	}
	public List<Competency> getCompetencies() {
		return competencies;
	}
	public void setCompetencies(List<Competency> competencies) {
		this.competencies = competencies;
	}
	public ContactInformation getContactinformation() {
		return contactinformation;
	}
	public void setContactinformation(ContactInformation contactinformation) {
		this.contactinformation = contactinformation;
	}
	@Override
	public String toString() {
		return "User [personnel=" + personnel + ", courseList=" + courses + ", competencyList=" + competencies
				+ "]";
	}
}
