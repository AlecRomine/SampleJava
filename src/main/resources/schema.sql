DROP TABLE IF EXISTS PERSONAL;
DROP TABLE IF EXISTS ORGANIZATION;
DROP TABLE IF EXISTS COMPETENCY_COURSE_LIST;
DROP TABLE IF EXISTS EMPLOYMENT;
DROP TABLE IF EXISTS COMPETENCY;
DROP TABLE IF EXISTS COURSELIST;

CREATE TABLE PERSONAL (
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	name VARCHAR(250) NOT NULL,
  	preferred_name VARCHAR(250) NOT NULL,
  	title VARCHAR(250) NOT NULL,
	name_prefix VARCHAR(250) NOT NULL,
	name_suffix VARCHAR(250) NOT NULL,
	qualification_code VARCHAR(250) NOT NULL,
	maiden_name VARCHAR(250) NOT NULL,
	hrid VARCHAR(250) NOT NULL,
	student_id VARCHAR(250) NOT NULL,
	telephone_number VARCHAR(250) NOT NULL,
	primary_phone_number VARCHAR(250) NOT NULL,
	birthdate VARCHAR(250) NOT NULL,
	email VARCHAR(250) NOT NULL,
	email_type VARCHAR(250) NOT NULL,
	citizenship VARCHAR(250) NOT NULL,
	veteran VARCHAR(250) NOT NULL,
	sex VARCHAR(250) NOT NULL,
	primary_language VARCHAR(250) NOT NULL,
	emergency_contact VARCHAR(250) NOT NULL,
	address VARCHAR(250) NOT NULL,
	address_two VARCHAR(250) NOT NULL
);
CREATE TABLE ORGANIZATION(
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	organization_name VARCHAR(250) NOT NULL,
	industry_identifier VARCHAR(250) NOT NULL,
	parent_organization VARCHAR(250) NOT NULL,
	accreditation_type VARCHAR(250) NOT NULL,
	organization_identifier VARCHAR(250) NOT NULL,
	organization_fein VARCHAR(250) NOT NULL,
	organization_accredits VARCHAR(250) NOT NULL,
	accreditation_award_date VARCHAR(250) NOT NULL,
	organization_identification_code VARCHAR(250) NOT NULL,
	organization_description VARCHAR(250) NOT NULL,
	accredited_by VARCHAR(250) NOT NULL,
	accredited_expiration_date VARCHAR(250) NOT NULL
);

CREATE TABLE COURSELIST(
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	course_id VARCHAR(250) NOT NULL,
  	course_name VARCHAR(250) NOT NULL,
  	provider_name VARCHAR(250) NOT NULL,
  	start_date VARCHAR(250) NOT NULL,
  	end_date VARCHAR(250) NOT NULL,
  	enrollment_date VARCHAR(250) NOT NULL,
  	status VARCHAR(250) NOT NULL
);

CREATE TABLE COMPETENCY(
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	comp_name VARCHAR(250) NOT NULL,
  	comp_ed_level VARCHAR(250) NOT NULL,
  	badge VARCHAR(250) NOT NULL,
  	conf_date VARCHAR(250) NOT NULL,
  	course_list VARCHAR(250)
);

CREATE TABLE EMPLOYMENT(
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	employer_name VARCHAR(250) NOT NULL,
  	employment_start_date VARCHAR(250) NOT NULL,
  	employed VARCHAR(250) NOT NULL,
  	employer_department VARCHAR(250) NOT NULL,
  	employment_end_date VARCHAR(250) NOT NULL,
  	occupation VARCHAR(250) NOT NULL,
  	hire_date VARCHAR(250) NOT NULL,
  	position_title VARCHAR(250) NOT NULL
);