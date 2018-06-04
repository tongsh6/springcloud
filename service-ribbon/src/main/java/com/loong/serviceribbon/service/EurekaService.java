package com.loong.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EurekaService {
	@Autowired
	RestTemplate restTemplate;

	public String eurekaService(String name) {
		return restTemplate.getForObject("http://eureka-client-service/EurekaService?name=" + name, String.class);
	}
}
