package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Competency")
public class Competency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "compId")
	private int compId;	
	@Column(name = "compName")
	private String compName;
	@Column(name = "compEdLevel")
	private String compEdLevel;
	@Column
    @ElementCollection(targetClass=CourseList.class)
	private List<CourseList> courseList;
	@Column(name = "badge")
	private String badge;
	
	
	public Competency() {}
	public Competency(int compId, String compName, String compEdLevel, List<CourseList> courseList, String badge) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.compEdLevel = compEdLevel;
		this.courseList = courseList;
		this.badge = badge;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompEdLevel() {
		return compEdLevel;
	}
	public void setCompEdLevel(String compEdLevel) {
		this.compEdLevel = compEdLevel;
	}
	public List<CourseList> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<CourseList> courseList) {
		this.courseList = courseList;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	public String getBadge() {
		return badge;
	}
}
