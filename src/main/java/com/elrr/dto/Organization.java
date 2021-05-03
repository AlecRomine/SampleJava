package com.elrr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "organization_name")
	private String organizationName;
	@Column(name = "industry_identifier")
	private String industryIdentifier;
	@Column(name = "parent_organization")
	private String parentOrganization;
	@Column(name = "accreditation_type")
	private String accreditationType;
	@Column(name = "organization_identifier")
	private String organizationIdentifier;
	@Column(name = "organization_fein")
	private String organizationFEIN;
	@Column(name = "organization_accredits")
	private String organizationAccredits;
	@Column(name = "accreditation_award_date")
	private String accreditationAwardDate;
	@Column(name = "organization_identification_code")
	private String organizationIdentificationCode;
	@Column(name = "organization_description")
	private String organizationDescription;
	@Column(name = "accredited_by")
	private String accreditedBy;
	@Column(name = "accredited_expiration_date")
	private String 	accreditedExpirationDate;
	
	public Organization() {}

	public Organization(String organizationName, String industryIdentifier, String parentOrganization,
			String accreditationType, String organizationIdentifier, String organizationFEIN,
			String organizationAccredits, String accreditationAwardDate, String organizationIdentificationCode,
			String organizationDescription, String accreditedBy, String accreditedExpirationDate) {
		super();
		this.organizationName = organizationName;
		this.industryIdentifier = industryIdentifier;
		this.parentOrganization = parentOrganization;
		this.accreditationType = accreditationType;
		this.organizationIdentifier = organizationIdentifier;
		this.organizationFEIN = organizationFEIN;
		this.organizationAccredits = organizationAccredits;
		this.accreditationAwardDate = accreditationAwardDate;
		this.organizationIdentificationCode = organizationIdentificationCode;
		this.organizationDescription = organizationDescription;
		this.accreditedBy = accreditedBy;
		this.accreditedExpirationDate = accreditedExpirationDate;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getIndustryIdentifier() {
		return industryIdentifier;
	}

	public void setIndustryIdentifier(String industryIdentifier) {
		this.industryIdentifier = industryIdentifier;
	}

	public String getParentOrganization() {
		return parentOrganization;
	}

	public void setParentOrganization(String parentOrganization) {
		this.parentOrganization = parentOrganization;
	}

	public String getAccreditationType() {
		return accreditationType;
	}

	public void setAccreditationType(String accreditationType) {
		this.accreditationType = accreditationType;
	}

	public String getOrganizationIdentifier() {
		return organizationIdentifier;
	}

	public void setOrganizationIdentifier(String organizationIdentifier) {
		this.organizationIdentifier = organizationIdentifier;
	}

	public String getOrganizationFEIN() {
		return organizationFEIN;
	}

	public void setOrganizationFEIN(String organizationFEIN) {
		this.organizationFEIN = organizationFEIN;
	}

	public String getOrganizationAccredits() {
		return organizationAccredits;
	}

	public void setOrganizationAccredits(String organizationAccredits) {
		this.organizationAccredits = organizationAccredits;
	}

	public String getAccreditationAwardDate() {
		return accreditationAwardDate;
	}

	public void setAccreditationAwardDate(String accreditationAwardDate) {
		this.accreditationAwardDate = accreditationAwardDate;
	}

	public String getOrganizationIdentificationCode() {
		return organizationIdentificationCode;
	}

	public void setOrganizationIdentificationCode(String organizationIdentificationCode) {
		this.organizationIdentificationCode = organizationIdentificationCode;
	}

	public String getOrganizationDescription() {
		return organizationDescription;
	}

	public void setOrganizationDescription(String organizationDescription) {
		this.organizationDescription = organizationDescription;
	}

	public String getAccreditedBy() {
		return accreditedBy;
	}

	public void setAccreditedBy(String accreditedBy) {
		this.accreditedBy = accreditedBy;
	}

	public String getAccreditedExpirationDate() {
		return accreditedExpirationDate;
	}

	public void setAccreditedExpirationDate(String accreditedExpirationDate) {
		this.accreditedExpirationDate = accreditedExpirationDate;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", organizationName=" + organizationName + ", industryIdentifier="
				+ industryIdentifier + ", parentOrganization=" + parentOrganization + ", accreditationType="
				+ accreditationType + ", organizationIdentifier=" + organizationIdentifier + ", organizationFEIN="
				+ organizationFEIN + ", organizationAccredits=" + organizationAccredits + ", accreditationAwardDate="
				+ accreditationAwardDate + ", organizationIdentificationCode=" + organizationIdentificationCode
				+ ", organizationDescription=" + organizationDescription + ", accreditedBy=" + accreditedBy
				+ ", accreditedExpirationDate=" + accreditedExpirationDate + "]";
	}
	
}
