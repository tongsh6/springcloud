package com.loong.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHystric implements FeignService {

	@Override
	public String eurekaService(String name) {
		  return "sorry "+name;
	}

}
