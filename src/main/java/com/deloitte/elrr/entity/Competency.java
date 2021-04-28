package com.deloitte.elrr.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="competency")
public class Competency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "comp_name")
	private String compName;
	@Column(name = "comp_ed_level")
	private String compEdLevel;
//	@Column
//  @ElementCollection(targetClass=CourseList.class)
//	private List<CourseList> courseList;
	@Column(name = "badge")
	private String badge;
	@Column(name = "conf_date")
	private String confDate;
	
	
	public Competency() {}
	public Competency(String compName, String compEdLevel/*, List<CourseList> courseList*/, String badge, String confDate) {
		super();
		this.compName = compName;
		this.compEdLevel = compEdLevel;
//		this.courseList = courseList;
		this.badge = badge;
		this.confDate = confDate;
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
//	public List<CourseList> getCourseList() {
//		return courseList;
//	}
//	public void setCourseList(List<CourseList> courseList) {
//		this.courseList = courseList;
//	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	public String getBadge() {
		return badge;
	}
	public String getConfDate() {
		return confDate;
	}
	public void setConfDate(String confDate) {
		this.confDate = confDate;
	}
	@Override
	public String toString() {
		return "Competency [id=" + id + ", compName=" + compName + ", compEdLevel=" + compEdLevel + /*", courseList="
				+ courseList +*/ ", badge=" + badge + ", confDate=" + confDate + "]";
	}
}
