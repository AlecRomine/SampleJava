package com.deloitte.elrr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courselist")
public class CourseList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="course_id")
	private String courseID;
	@Column(name="course_name")
	private String courseName;
	@Column(name="provider_name")
	private String providerName;
	@Column(name="start_date")
	private String startDate;
	@Column(name="end_date")
	private String endDate;
	@Column(name="award_date")
	private String awardDate;
	@Column(name="expiration_date")
	private String expirationDate;
	@Column(name="status")
	private String status;
	
	public CourseList() {}
	public CourseList(String courseID, String courseName, String providerName, String startDate, String endDate,
	String awardDate, String expirationDate, String status) {
		super();
		this.courseID= courseID;
		this.courseName=courseName;
		this.providerName=providerName;
		this.startDate=startDate;
		this.endDate=endDate;
		this.awardDate=awardDate;
		this.expirationDate=expirationDate;
		this.status=status;
	}
	public String getcourseID() {
		return courseID;
	}
	public void setcourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(String awardDate) {
		this.awardDate = awardDate;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CourseList [id=" + id + ", courseID=" + courseID + ", courseName=" + courseName + ", providerName="
				+ providerName + ", startDate=" + startDate + ", endDate=" + endDate + ", awardDate=" + awardDate
				+ ", expirationDate=" + expirationDate + ", status=" + status + "]";
	}
}
