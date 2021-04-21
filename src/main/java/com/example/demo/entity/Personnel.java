package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class  Personnel{

	private Personal personal;
	
	public Personnel(){}
	
	public Personnel(Personal personal) {
		super();
		this.personal = personal;
	}
	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
}
