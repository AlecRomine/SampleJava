package com.elrr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Person {
	
	private long id;
	private String userrole;
	private String name;
	private String preferredname;
	private String title;
	private String nameprefix;
	private String namesuffix;
	private String qualificationcode;
	private String maidenname;
	private String hrID;
	private String studentId;
	private String telephonenumber;
	private String primaryphonenumber;
	private String birthdate;
	private String email;
	private String emailtype;
	private String citizenship;
	private String militaryveteranindicator;
	private String sex;
	private String primarylanguage;
	private String emergencycontact;
	private String address;
	private String addresstwo;
	
}
