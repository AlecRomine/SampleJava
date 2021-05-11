package com.elrr.apiCalls;

import org.springframework.stereotype.Component;

@Component
public class JsonStorage {

	public String learnerJSON() {
		String json ="{"
				+ "    \"personnel\": {"
				+ "        \"person\": {"
				+ "            \"userrole\": \"Learner\", "
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"personid\": 100,"
				+ "            \"name\": \"Alexandrina Annabelle Arredondo-Arteaga\","
				+ "            \"firstname\": \"Alexandrina\","
				+ "            \"middlename\": \"Annabelle\","
				+ "            \"lastname\": \"Arredondo-Arteaga\","
				+ "            \"nameprefix\": \"Ms.\","
				+ "            \"titleaffixcode\": null,"
				+ "            \"namesuffix\": \"none\","
				+ "            \"qualificationaffixcode\": null,"
				+ "            \"maidenname\": \"Atkinson-Abbas\","
				+ "            \"preferredname\": \"Alexandrina Arredondo-Arteaga\","
				+ "            \"humanresourceidentifier\": \"3599900000\","
				+ "            \"personnelidentificationsystem\": null,"
				+ "            \"birthdate\": \"2000-12-31T05:00:00.000+00:00\","
				+ "            \"sex\": \"F\","
				+ "            \"primarylanguage\": \"Spanish\","
				+ "            \"militaryveteranindicator\": \"Y\","
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "        \"organization\": {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"organizationid\": 100,"
				+ "            \"organizationname\": \"AETC\","
				+ "            \"organizationidentifier\": \"D0DAF\","
				+ "            \"organizationidentificationcode\": \"G0V4\","
				+ "            \"organizationidentificationsystem\": null,"
				+ "            \"industrytypeidentifier\": null,"
				+ "            \"organizationfein\": \"1234573\","
				+ "            \"organizationdescription\": \"DoD AIR FORCE\","
				+ "            \"parentorganization\": \"AIR FORCE\","
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "    	   \"contactInformation\": {"
				+ "    			\"contactinformation\":\"email\",	"
				+ "     		\"emergencycontact\":\"email\",	"
				+ "     		\"electronicmailaddresstype\":\"personal\",	"
				+ "     		\"isprimaryindicator\":\"Y\",	"
				+ "     		\"electronicmailaddress\":\"alex91@gmail.com\"	"
				+ "			},"
				+ "        \"employment\": ["
				+ "            {"
				+ "                \"inserteddate\": null,"
				+ "                \"updatedBy\": null,"
				+ "                \"lastmodified\": null,"
				+ "                \"employmentid\": 100,"
				+ "                \"employername\": \"NAVY\","
				+ "                \"employerdepartment\": \"NAVY\","
				+ "                \"hiredate\": 10101,"
				+ "                \"employmentstartdate\": 20202,"
				+ "                \"employmentenddate\": 30303,"
				+ "                \"joblevel\": \"Petty Officer Third Class\","
				+ "                \"occupation\": \"Mass Communications Specialist\","
				+ "                \"employed\": \"Y\","
				+ "                \"primarycarrercategory\": null,"
				+ "                \"secondcarrercategory\": null,"
				+ "                \"recordstatus\": null"
				+ "            },"
				+ "            {"
				+ "                \"inserteddate\": null,"
				+ "                \"updatedBy\": null,"
				+ "                \"lastmodified\": null,"
				+ "                \"employmentid\": 100,"
				+ "                \"employerName\": \"NAVY\","
				+ "                \"employerdepartment\": \"\","
				+ "                \"hiredate\": null,"
				+ "                \"employmentstartdate\": null,"
				+ "                \"employmentenddate\": null,"
				+ "                \"joblevel\": \"Petty Officer Third Class\","
				+ "                \"occupation\": \"Mass Communications Specialist\","
				+ "                \"employed\": \"Y\","
				+ "                \"primarycarrercategory\": null,"
				+ "                \"secondcarrercategory\": null,"
				+ "                \"recordstatus\": null"
				+ "            }"
				+ "        ]"
				+ "    },"
				+ "    \"courses\": ["
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"courseid\": 101,"
				+ "            \"name\": \"Fundamentals of Systems Acquisition Management\","
				+ "            \"coursesubjectmatter\": null,"
				+ "            \"coursesubjectabbreviation\": null,"
				+ "            \"courseidentifier\": \"ACQ 101\","
				+ "            \"courselevel\": null,"
				+ "            \"coursenumber\": \"Fundamentals of Systems Acquisition Management\","
				+ "            \"courseinstructionmethod\": \"Web\","
				+ "            \"coursestartdate\": 202020,"
				+ "            \"courseenddate\": 303030,"
				+ "            \"courseenrollmentdate\": 404040,"
				+ "            \"courseacademicgrade\": null,"
				+ "            \"courseprovidername\": \"DAU\","
				+ "            \"departmentname\": \"Defense Acquisition University\","
				+ "            \"coursegradescalecode\": null,"
				+ "            \"coursemetadatarepository\": null,"
				+ "            \"courselrsendpoint\": null,"
				+ "            \"coursedescription\": null,"
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"courseid\": 101,"
				+ "            \"name\": \"Mentoring the Acquisition Workforce\","
				+ "            \"coursesubjectmatter\": null,"
				+ "            \"coursesubjectabbreviation\": null,"
				+ "            \"courseidentifier\": \"CLC 067\","
				+ "            \"courselevel\": null,"
				+ "            \"coursenumber\": \"Mentoring the Acquisition Workforce\","
				+ "            \"courseinstructionmethod\": \"Web\","
				+ "            \"coursestartdate\": null,"
				+ "            \"courseenddate\": null,"
				+ "            \"courseenrollmentdate\": null,"
				+ "            \"courseacademicgrade\": null,"
				+ "            \"courseprovidername\": \"DAU\","
				+ "            \"departmentname\": \"Defense Acquisition University\","
				+ "            \"coursegradescalecode\": null,"
				+ "            \"coursemetadatarepository\": null,"
				+ "            \"courselrsendpoint\": null,"
				+ "            \"coursedescription\": null,"
				+ "            \"recordstatus\": null"
				+ "        }"
				+ "    ],"
				+ "    \"competencies\": ["
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"competencyid\": 100,"
				+ "            \"competencyframeworktitle\": \"SERVICE1\","
				+ "            \"competencyframeworkversion\": null,"
				+ "            \"competencyframeworkidentifier\": null,"
				+ "            \"competencyframeworkdescription\": null,"
				+ "            \"competencyframeworksubject\": null,"
				+ "            \"competencyframeworkvalidstartdate\": null,"
				+ "            \"competencyframeworkvalidenddate\": null,"
				+ "            \"competencydefinitionidentifier\": null,"
				+ "            \"competencydefinitionidentifierurl\": null,"
				+ "            \"competencytaxonomyid\": null,"
				+ "            \"competencydefinitionvalidstartdate\": null,"
				+ "            \"competencydefinitionvalideenddate\": null,"
				+ "            \"competencydefinitionparentidentifier\": null,"
				+ "            \"competencydefinitionparenturl\": null,"
				+ "            \"competencydescriptionparentcode\": null,"
				+ "            \"competencydefinitioncode\": null,"
				+ "            \"competencydefinitionstatement\": null,"
				+ "            \"competencydefinitiontypeurl\": null,"
				+ "            \"competencydefinitiontype\": null,"
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"competencyid\": 101,"
				+ "            \"competencyframeworktitle\": \"SERVICE2\","
				+ "            \"competencyframeworkversion\": null,"
				+ "            \"competencyframeworkidentifier\": null,"
				+ "            \"competencyframeworkdescription\": null,"
				+ "            \"competencyframeworksubject\": null,"
				+ "            \"competencyframeworkvalidstartdate\": null,"
				+ "            \"competencyframeworkvalidenddate\": null,"
				+ "            \"competencydefinitionidentifier\": null,"
				+ "            \"competencydefinitionidentifierurl\": null,"
				+ "            \"competencytaxonomyid\": null,"
				+ "            \"competencydefinitionvalidstartdate\": null,"
				+ "            \"competencydefinitionvalideenddate\": null,"
				+ "            \"competencydefinitionparentidentifier\": null,"
				+ "            \"competencydefinitionparenturl\": null,"
				+ "            \"competencydescriptionparentcode\": null,"
				+ "            \"competencydefinitioncode\": null,"
				+ "            \"competencydefinitionstatement\": null,"
				+ "            \"competencydefinitiontypeurl\": null,"
				+ "            \"competencydefinitiontype\": null,"
				+ "            \"recordstatus\": null"
				+ "        }"
				+ "    ]"
				+ "}";
		return json;
	}
	public String trainingJSON() {
		String json ="{"
				+ "    \"personnel\": {"
				+ "        \"person\": {"
				+ "            \"userrole\": \"Training\", "
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"personid\": 100,"
				+ "            \"name\": \"Alexandrina Annabelle Arredondo-Arteaga\","
				+ "            \"firstname\": \"Alexandrina\","
				+ "            \"middlename\": \"Annabelle\","
				+ "            \"lastname\": \"Arredondo-Arteaga\","
				+ "            \"nameprefix\": \"Ms.\","
				+ "            \"titleaffixcode\": null,"
				+ "            \"namesuffix\": \"none\","
				+ "            \"qualificationaffixcode\": null,"
				+ "            \"maidenname\": \"Atkinson-Abbas\","
				+ "            \"preferredname\": \"Alexandrina Arredondo-Arteaga\","
				+ "            \"humanresourceidentifier\": \"3599900000\","
				+ "            \"personnelidentificationsystem\": null,"
				+ "            \"birthdate\": \"2000-12-31T05:00:00.000+00:00\","
				+ "            \"sex\": \"F\","
				+ "            \"primarylanguage\": \"Spanish\","
				+ "            \"militaryveteranindicator\": \"Y\","
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "        \"organization\": {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"organizationid\": 100,"
				+ "            \"organizationname\": \"AETC\","
				+ "            \"organizationidentifier\": \"D0DAF\","
				+ "            \"organizationidentificationcode\": \"G0V4\","
				+ "            \"organizationidentificationsystem\": null,"
				+ "            \"industrytypeidentifier\": null,"
				+ "            \"organizationfein\": \"1234573\","
				+ "            \"organizationdescription\": \"DoD AIR FORCE\","
				+ "            \"parentorganization\": \"AIR FORCE\","
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "    	   \"contactInformation\": {"
				+ "    			\"contactinformation\":\"email\",	"
				+ "     		\"emergencycontact\":\"email\",	"
				+ "     		\"electronicmailaddresstype\":\"personal\",	"
				+ "     		\"isprimaryindicator\":\"Y\",	"
				+ "     		\"electronicmailaddress\":\"alex91@gmail.com\"	"
				+ "			},"
				+ "        \"employment\": ["
				+ "            {"
				+ "                \"inserteddate\": null,"
				+ "                \"updatedBy\": null,"
				+ "                \"lastmodified\": null,"
				+ "                \"employmentid\": 100,"
				+ "                \"employername\": \"NAVY\","
				+ "                \"employerdepartment\": \"NAVY\","
				+ "                \"hiredate\": 10101,"
				+ "                \"employmentstartdate\": 20202,"
				+ "                \"employmentenddate\": 30303,"
				+ "                \"joblevel\": \"Petty Officer Third Class\","
				+ "                \"occupation\": \"Mass Communications Specialist\","
				+ "                \"employed\": \"Y\","
				+ "                \"primarycarrercategory\": null,"
				+ "                \"secondcarrercategory\": null,"
				+ "                \"recordstatus\": null"
				+ "            },"
				+ "            {"
				+ "                \"inserteddate\": null,"
				+ "                \"updatedBy\": null,"
				+ "                \"lastmodified\": null,"
				+ "                \"employmentid\": 100,"
				+ "                \"employerName\": \"NAVY\","
				+ "                \"employerdepartment\": \"\","
				+ "                \"hiredate\": null,"
				+ "                \"employmentstartdate\": null,"
				+ "                \"employmentenddate\": null,"
				+ "                \"joblevel\": \"Petty Officer Third Class\","
				+ "                \"occupation\": \"Mass Communications Specialist\","
				+ "                \"employed\": \"Y\","
				+ "                \"primarycarrercategory\": null,"
				+ "                \"secondcarrercategory\": null,"
				+ "                \"recordstatus\": null"
				+ "            }"
				+ "        ]"
				+ "    },"
				+ "    \"courses\": ["
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"courseid\": 101,"
				+ "            \"name\": \"Fundamentals of Systems Acquisition Management\","
				+ "            \"coursesubjectmatter\": null,"
				+ "            \"coursesubjectabbreviation\": null,"
				+ "            \"courseidentifier\": \"ACQ 101\","
				+ "            \"courselevel\": null,"
				+ "            \"coursenumber\": \"Fundamentals of Systems Acquisition Management\","
				+ "            \"courseinstructionmethod\": \"Web\","
				+ "            \"coursestartdate\": 202020,"
				+ "            \"courseenddate\": 303030,"
				+ "            \"courseenrollmentdate\": 404040,"
				+ "            \"courseacademicgrade\": null,"
				+ "            \"courseprovidername\": \"DAU\","
				+ "            \"departmentname\": \"Defense Acquisition University\","
				+ "            \"coursegradescalecode\": null,"
				+ "            \"coursemetadatarepository\": null,"
				+ "            \"courselrsendpoint\": null,"
				+ "            \"coursedescription\": null,"
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"courseid\": 101,"
				+ "            \"name\": \"Mentoring the Acquisition Workforce\","
				+ "            \"coursesubjectmatter\": null,"
				+ "            \"coursesubjectabbreviation\": null,"
				+ "            \"courseidentifier\": \"CLC 067\","
				+ "            \"courselevel\": null,"
				+ "            \"coursenumber\": \"Mentoring the Acquisition Workforce\","
				+ "            \"courseinstructionmethod\": \"Web\","
				+ "            \"coursestartdate\": null,"
				+ "            \"courseenddate\": null,"
				+ "            \"courseenrollmentdate\": null,"
				+ "            \"courseacademicgrade\": null,"
				+ "            \"courseprovidername\": \"DAU\","
				+ "            \"departmentname\": \"Defense Acquisition University\","
				+ "            \"coursegradescalecode\": null,"
				+ "            \"coursemetadatarepository\": null,"
				+ "            \"courselrsendpoint\": null,"
				+ "            \"coursedescription\": null,"
				+ "            \"recordstatus\": null"
				+ "        }"
				+ "    ],"
				+ "    \"competencies\": ["
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"competencyid\": 100,"
				+ "            \"competencyframeworktitle\": \"SERVICE1\","
				+ "            \"competencyframeworkversion\": null,"
				+ "            \"competencyframeworkidentifier\": null,"
				+ "            \"competencyframeworkdescription\": null,"
				+ "            \"competencyframeworksubject\": null,"
				+ "            \"competencyframeworkvalidstartdate\": null,"
				+ "            \"competencyframeworkvalidenddate\": null,"
				+ "            \"competencydefinitionidentifier\": null,"
				+ "            \"competencydefinitionidentifierurl\": null,"
				+ "            \"competencytaxonomyid\": null,"
				+ "            \"competencydefinitionvalidstartdate\": null,"
				+ "            \"competencydefinitionvalideenddate\": null,"
				+ "            \"competencydefinitionparentidentifier\": null,"
				+ "            \"competencydefinitionparenturl\": null,"
				+ "            \"competencydescriptionparentcode\": null,"
				+ "            \"competencydefinitioncode\": null,"
				+ "            \"competencydefinitionstatement\": null,"
				+ "            \"competencydefinitiontypeurl\": null,"
				+ "            \"competencydefinitiontype\": null,"
				+ "            \"recordstatus\": null"
				+ "        },"
				+ "        {"
				+ "            \"inserteddate\": null,"
				+ "            \"updatedBy\": null,"
				+ "            \"lastmodified\": null,"
				+ "            \"competencyid\": 101,"
				+ "            \"competencyframeworktitle\": \"SERVICE2\","
				+ "            \"competencyframeworkversion\": null,"
				+ "            \"competencyframeworkidentifier\": null,"
				+ "            \"competencyframeworkdescription\": null,"
				+ "            \"competencyframeworksubject\": null,"
				+ "            \"competencyframeworkvalidstartdate\": null,"
				+ "            \"competencyframeworkvalidenddate\": null,"
				+ "            \"competencydefinitionidentifier\": null,"
				+ "            \"competencydefinitionidentifierurl\": null,"
				+ "            \"competencytaxonomyid\": null,"
				+ "            \"competencydefinitionvalidstartdate\": null,"
				+ "            \"competencydefinitionvalideenddate\": null,"
				+ "            \"competencydefinitionparentidentifier\": null,"
				+ "            \"competencydefinitionparenturl\": null,"
				+ "            \"competencydescriptionparentcode\": null,"
				+ "            \"competencydefinitioncode\": null,"
				+ "            \"competencydefinitionstatement\": null,"
				+ "            \"competencydefinitiontypeurl\": null,"
				+ "            \"competencydefinitiontype\": null,"
				+ "            \"recordstatus\": null"
				+ "        }"
				+ "    ],"
				+ "    \"assignedlearners\": ["
				+ "        {"
				+ "       	\"id\":\"34567\","
				+ "			\"name\":\"Lindsey Glass\","
				+ "			\"courselist\": "
				+ "				\"<p style='display:none;'>nine</p><p style='display:none;'>five</p>\" "
				+ "			,"
				+ "			\"coursestatuslist\": "
				+ "				\"<p style='display:none;'>en</p><p style='display:none;'>roll</p>\" "
				+ "         ,"
				+ "			\"competencylist\": "
				+ "				\"<p style='display:none;'>ten</p>\" "
				+ "         ,"
				+ "			\"competencystatuslist\": "
				+ "				\"<p style='display:none;'>Enrolled</p>\" "
				+ "        }"
				+ "		]"
				+ "}";
		return json;
	}

}