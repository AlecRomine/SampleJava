package com.deloitte.elrr.restTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class ApiCalls {

	public void learnerInfoGatherer() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<?> httpEntity = new HttpEntity<>(headers);

		RestTemplate restTemplate = new RestTemplate();

		restTemplate.exchange("URL", HttpMethod.POST, httpEntity, String.class);
	}
}
