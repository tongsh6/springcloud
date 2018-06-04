package com.loong.sericeribbonhystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loong.sericeribbonhystrix.service.HystrixEurekaService;

@RestController
public class EurekaController {
	@Autowired
	HystrixEurekaService hystrixEurekaService;

	@RequestMapping(value = "/HystrixRibbonService")
	public String ribbonService(@RequestParam String name) {
		return hystrixEurekaService.eurekaService(name);
	}
}
