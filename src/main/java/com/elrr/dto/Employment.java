package com.elrr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employment")
public class Employment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "employer_name")
	private String employerName;
	@Column(name = "employment_start_date")
	private String employmentStartDate;
	@Column(name = "employed")
	private String employed;
	@Column(name = "employer_department")
	private String employerDepartment;
	@Column(name = "employment_end_date")
	private String employmentEndDate;
	@Column(name = "occupation")
	private String occupation;
	@Column(name = "hire_date")
	private String hireDate;
	@Column(name = "position_title")
	private String positionTitle;
	public Employment() {}
	public Employment(String employerName, String employmentStartDate, String employed, String employerDepartment,
			String employmentEndDate, String occupation, String hireDate, String positionTitle) {
		super();
		this.employerName = employerName;
		this.employmentStartDate = employmentStartDate;
		this.employed = employed;
		this.employerDepartment = employerDepartment;
		this.employmentEndDate = employmentEndDate;
		this.occupation = occupation;
		this.hireDate = hireDate;
		this.positionTitle = positionTitle;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmploymentStartDate() {
		return employmentStartDate;
	}
	public void setEmploymentStartDate(String employmentStartDate) {
		this.employmentStartDate = employmentStartDate;
	}
	public String getEmployed() {
		return employed;
	}
	public void setEmployed(String employed) {
		this.employed = employed;
	}
	public String getEmployerDepartment() {
		return employerDepartment;
	}
	public void setEmployerDepartment(String employerDepartment) {
		this.employerDepartment = employerDepartment;
	}
	public String getEmploymentEndDate() {
		return employmentEndDate;
	}
	public void setEmploymentEndDate(String employmentEndDate) {
		this.employmentEndDate = employmentEndDate;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getPositionTitle() {
		return positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	@Override
	public String toString() {
		return "Employment [id=" + id + ", employerName=" + employerName + ", employmentStartDate="
				+ employmentStartDate + ", employed=" + employed + ", employerDepartment=" + employerDepartment
				+ ", employmentEndDate=" + employmentEndDate + ", occupation=" + occupation + ", hireDate=" + hireDate
				+ ", positionTitle=" + positionTitle + "]";
	}
	
}
