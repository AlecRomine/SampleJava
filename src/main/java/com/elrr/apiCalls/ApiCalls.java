package com.elrr.apiCalls;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.elrr.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiCalls {

	public void learnerInfoGatherer(String name, String password) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> httpEntity = new HttpEntity<>(headers);

		UriComponentsBuilder builder= UriComponentsBuilder.fromHttpUrl("url.com")
				.queryParam("name", name)
				.queryParam("pass", password);
		
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.exchange( 
				builder.toUriString(), 
				HttpMethod.POST, 
				httpEntity, 
				String.class);
		
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
            System.out.println("response received");
            System.out.println(responseEntity.getBody());
            ObjectMapper map = new ObjectMapper();
    		try {
    			map.readValue(responseEntity.getBody(), User.class);
    		} catch (JsonMappingException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (JsonProcessingException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        } else {
            System.out.println("error occurred");
            System.out.println(responseEntity.getStatusCode());
        }
		
	}
}
