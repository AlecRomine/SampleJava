package com.elrr.apiCalls;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.elrr.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Component
public class ApiCalls {

	public User learnerInfoGatherer(String name, String password) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> httpEntity = new HttpEntity<>(headers);

//		UriComponentsBuilder builder= UriComponentsBuilder.fromHttpUrl("localhost:8080/api/learner")
//				.queryParam("name", name)
//				.queryParam("pass", password);
		String json ="{"
				+ "    \"personnel\": {"
				+ "        \"person\": {"
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
				+ "    \"contactinformation\": {"
				+ "    		\"contactinformation\":\"email\",	"
				+ "     	\"emergencycontact\":\"email\",	"
				+ "     	\"electronicmailaddresstype\":\"personal\",	"
				+ "     	\"isprimaryindicator\":\"Y\",	"
				+ "     	\"electronicmailaddress\":\"alex91@gmail.com\"	"
				+ "		}"
				+ "}";
		User learner = new User();
		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> responseEntity = restTemplate.exchange( 
//				builder.toUriString(), 
//				HttpMethod.POST, 
//				httpEntity, 
//				String.class);
//		if (responseEntity.getStatusCode() == HttpStatus.OK) {
//            System.out.println("response received");
//            System.out.println(responseEntity.getBody());
            ObjectMapper map = new ObjectMapper();
    		try {
    			learner=map.readValue(json, User.class);
    			System.out.println(json);
    			System.out.println(learner);
    		} catch (JsonMappingException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (JsonProcessingException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
//        } else {
//            System.out.println("error occurred");
//            System.out.println(responseEntity.getStatusCode());
//        }
		return learner;
	}
}
