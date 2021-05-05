package com.elrr.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class  Personnel{

	private Person person;
	private Organization organization;
	private List<Employment> employment;
	
	public Person getperson() {
		return person;
	}

	public void setperson(Person person) {
		this.person = person;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<Employment> getEmployment() {
		return employment;
	}

	public void setEmployment(List<Employment> employment) {
		this.employment = employment;
	}
	
	@Override
	public String toString() {
		return "Personnel [person=" + person + ", organization=" + organization + ", employment=" + employment
				+ "]";
	}
}
