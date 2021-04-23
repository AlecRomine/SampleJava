DROP TABLE IF EXISTS PERSONAL;
DROP TABLE IF EXISTS ORGANIZATION;
  
CREATE TABLE PERSONAL (
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	name VARCHAR(250) NOT NULL,
  	preferredName VARCHAR(250) NOT NULL,
  	title VARCHAR(250) NOT NULL,
	namePrefix VARCHAR(250) NOT NULL,
	nameSuffix VARCHAR(250) NOT NULL,
	qualificationCode VARCHAR(250) NOT NULL,
	maidenName VARCHAR(250) NOT NULL,
	hrID VARCHAR(250) NOT NULL,
	studentId VARCHAR(250) NOT NULL,
	telephoneNumber VARCHAR(250) NOT NULL,
	primaryPhoneNumber VARCHAR(250) NOT NULL,
	birthdate VARCHAR(250) NOT NULL,
	email VARCHAR(250) NOT NULL,
	emailType VARCHAR(250) NOT NULL,
	citizenship VARCHAR(250) NOT NULL,
	veteran VARCHAR(250) NOT NULL,
	sex VARCHAR(250) NOT NULL,
	primaryLanguage VARCHAR(250) NOT NULL,
	emergencyContact VARCHAR(250) NOT NULL,
	address VARCHAR(250) NOT NULL,
	addressTwo VARCHAR(250) NOT NULL
);
CREATE TABLE ORGANIZATION(
  	id INT AUTO_INCREMENT PRIMARY KEY,
  	organizationName VARCHAR(250) NOT NULL,
	industryIdentifier VARCHAR(250) NOT NULL,
	parentOrganization VARCHAR(250) NOT NULL,
	accreditationType VARCHAR(250) NOT NULL,
	organizationIdentifier VARCHAR(250) NOT NULL,
	organizationFEIN VARCHAR(250) NOT NULL,
	organizationAccredits VARCHAR(250) NOT NULL,
	accreditationAwardDate VARCHAR(250) NOT NULL,
	organizationIdentificationCode VARCHAR(250) NOT NULL,
	organizationDescription VARCHAR(250) NOT NULL,
	accreditedBy VARCHAR(250) NOT NULL,
	accreditedExpirationDate VARCHAR(250) NOT NULL
);

);