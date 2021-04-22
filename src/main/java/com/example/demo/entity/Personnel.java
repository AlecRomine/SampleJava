package com.example.demo.entity;

import java.util.List;

public class  Personnel{

	private Personal personal;
	private Organization organization;
	private List<Employment> employment;
	
	public Personnel(){}
	
	public Personnel(Personal personal,Organization organization,List<Employment> employment) {
		super();
		this.personal = personal;
		this.organization=organization;
		this.employment=employment;
	}
	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
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
		return "Personnel [personal=" + personal + ", organization=" + organization + ", employment=" + employment
				+ "]";
	}
}
