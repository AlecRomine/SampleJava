INSERT INTO PERSONAL (
  	name, preferred_name, title, name_prefix, name_suffix, qualification_code, maiden_name, hrid, student_id, telephone_number, primary_phone_Number, birthdate, email, email_type, citizenship, veteran, sex, primary_language, emergency_contact, address, address_two)
VALUES (
	'Alice Beth Smith','Alice Smith','','','','','Smith','0987654321','1234567890','(480) 555-1234','Yes','July 4, 1985','alice.smith@us.af.mil','Organization','United States of America','Y','F','English','Smith S. Smithson (480) 555-1234','123 Taft St, Crystal City, VA 22201','Apartment 205');
	
INSERT INTO ORGANIZATION (
 	organization_name,industry_identifier,parent_organization,accreditation_type,organization_identifier,organization_fein,organization_accredits,accreditation_award_date,organization_identification_code,organization_description,accredited_by,accredited_expiration_date)
VALUES(
	'AETC','','Air Force','Lorem Ipsum','D0DAF','00001234567','Yes','01/01/2000','G0V4', 'D0D Air Force', 'Lorem Ipsum', 'XX/XX/XXXX');

INSERT INTO COMPETENCY(
	comp_name,comp_ed_level,badge,conf_date) 
VALUES ('Skills and Roles: Business Skills and Acumen ', 'Intermediate', '', '');
INSERT INTO COMPETENCY(
	comp_name,comp_ed_level,badge,conf_date) 
VALUES ('Contract Principles: General Contracting Concepts ', 'Intermediate', '/static/media/badge_services_Marked.4aa185ba.png', '12/20/2020');

INSERT INTO COURSELIST(
	    course_id,course_name,provider_name,start_date  ,end_date,enrollment_date,status)
VALUES ('ACQ','Acquisition Management','USAF','01/01/2021','05/31/2021','12/29/2020','Enrolled');
INSERT INTO COURSELIST(
	    course_id,course_name,provider_name,start_date  ,end_date    ,enrollment_date,status)
VALUES ('CON 091','Contracting Fundamentals','DAU','09/01/2020','12/20/2020','08/30/2020','Complete');
INSERT INTO COURSELIST(
	    course_id,course_name,provider_name,start_date,end_date, enrollment_date,status)
VALUES ('CON 100','Shaping Smart Business Arrangements', 'DAU','09/01/2020','12/20/2020','08/31/2020','Complete');
INSERT INTO COURSELIST(
	    course_id,course_name,provider_name,start_date  ,end_date    ,enrollment_date,status)
VALUES ('CTC 103','Cyber Awareness','USAF','01/01/2021','05/31/2021','12/30/2020','Enrolled');
INSERT INTO COURSELIST(
	    course_id,course_name,provider_name,start_date  ,end_date  ,enrollment_date,status)
VALUES ('CTC 101','Protecting Sensitive Information','USAF'        ,'01/01/2020','01/07/2020','12/31/2020'   ,'Complete');

INSERT INTO EMPLOYMENT(
	employed,employer_department,employer_name,employment_end_date,employment_start_date,hire_date,occupation,position_title)
VALUES ('boolean(T/F)', 'DoD Air Force Acquisitions', 'Air Force', '','01/01/2020', '12/14/2019', 'Manager of Team Acquisitions', 'Acquisition Manager');
INSERT INTO EMPLOYMENT(
	employed,employer_department,employer_name,employment_end_date,employment_start_date,hire_date,occupation,position_title)
VALUES ('boolean(T/F)', 'DoD Air Force Acquisitions', 'Air Force', '','01/01/2019', '12/14/2018', 'Manager of Team Acquisitions', 'Acquisition Manager');
