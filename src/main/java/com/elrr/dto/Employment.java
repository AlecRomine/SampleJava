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
public class Employment {
	private long id;
	private String employername;
	private String employmentstartdate;
	private String employed;
	private String employerdepartment;
	private String employmentenddate;
	private String occupation;
	private String hiredate;
	private String joblevel;	
}
