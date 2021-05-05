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
public class Organization {
	private long id;
	private String organizationname;
	private String industryidentifier;
	private String parentorganization;
	private String accreditationtype;
	private String organizationidentifier;
	private String organizationfein;
	private String organizationaccredits;
	private String accreditationawarddate;
	private String organizationidentificationcode;
	private String organizationdescription;
	private String accreditedby;
	private String 	accreditedexpirationdate;
}