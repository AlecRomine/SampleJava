package com.deloitte.elrr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="personal")
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "preferred_name")
	private String preferredName;
	@Column(name = "title")
	private String title;
	@Column(name = "name_prefix")
	private String namePrefix;
	@Column(name = "name_suffix")
	private String nameSuffix;
	@Column(name = "qualification_code")
	private String qualificationCode;
	@Column(name = "maiden_name")
	private String maidenName;
	@Column(name = "hrid")
	private String hrID;
	@Column(name = "student_id")
	private String studentId;
	@Column(name = "telephone_number")
	private String telephoneNumber;
	@Column(name = "primary_phone_number")
	private String primaryPhoneNumber;
	@Column(name = "birthdate")
	private String birthdate;
	@Column(name = "email")
	private String email;
	@Column(name = "email_type")
	private String emailType;
	@Column(name = "citizenship")
	private String citizenship;
	@Column(name = "veteran")
	private String veteran;
	@Column(name = "sex")
	private String sex;
	@Column(name = "primary_language")
	private String primaryLanguage;
	@Column(name = "emergency_contact")
	private String emergencyContact;
	@Column(name = "address")
	private String address;
	@Column(name = "address_two")
	private String addressTwo;
	
	public Personal() {}
	public Personal(String name, String preferredName, String title,String namePrefix, String nameSuffix,String qualificationCode, String maidenName, String hrID, String studentId,String telephoneNumber, 
					String primaryPhoneNumber,String birthdate, String email, String emailType, String citizenship, String veteran, String sex, String primaryLanguage, String emergencyContact, String address, String addressTwo) {
		super();
		 this.name = name;
		 this.preferredName=preferredName;
		 this.title=title;
		 this.namePrefix=namePrefix;
		 this.nameSuffix=nameSuffix;
		 this.qualificationCode=qualificationCode;
		 this.maidenName=maidenName;
		 this.hrID=hrID;
		 this.studentId=studentId;
		 this.telephoneNumber=telephoneNumber; 
		 this.primaryPhoneNumber=primaryPhoneNumber;
		 this.birthdate=birthdate;
		 this.email=email;
		 this.emailType=emailType;
		 this.citizenship=citizenship;
		 this.veteran=veteran;
		 this.sex=sex;
		 this.primaryLanguage=primaryLanguage;
		 this.emergencyContact=emergencyContact;  
		 this.address=address;
		 this.addressTwo=addressTwo;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public String getNameSuffix() {
		return nameSuffix;
	}
	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}
	public String getQualificationCode() {
		return qualificationCode;
	}
	public void setQualificationCode(String qualificationCode) {
		this.qualificationCode = qualificationCode;
	}
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public String getHrID() {
		return hrID;
	}
	public void setHrID(String hrID) {
		this.hrID = hrID;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}
	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getVeteran() {
		return veteran;
	}
	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPrimaryLanguage() {
		return primaryLanguage;
	}
	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	@Override
	public String toString() {
		return "Personal [id=" + id + ", name=" + name + ", preferredName=" + preferredName + ", title=" + title
				+ ", namePrefix=" + namePrefix + ", nameSuffix=" + nameSuffix + ", qualificationCode="
				+ qualificationCode + ", maidenName=" + maidenName + ", hrID=" + hrID + ", studentId=" + studentId
				+ ", telephoneNumber=" + telephoneNumber + ", primaryPhoneNumber=" + primaryPhoneNumber + ", birthdate="
				+ birthdate + ", email=" + email + ", emailType=" + emailType + ", citizenship=" + citizenship
				+ ", veteran=" + veteran + ", sex=" + sex + ", primaryLanguage=" + primaryLanguage
				+ ", emergencyContact=" + emergencyContact + ", address=" + address + ", addressTwo=" + addressTwo
				+ "]";
	}
}
