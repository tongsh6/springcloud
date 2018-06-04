package com.loong.sericeribbonhystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixEurekaService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "serviceError")
	public String eurekaService(String name) {
		return restTemplate.getForObject("http://eureka-client-service/EurekaService?name=" + name, String.class);
	}

	public String serviceError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
