package com.loong.serviceribbon.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loong.serviceribbon.service.EurekaService;

@RestController
public class EurekaHelloController {
	@Autowired
	EurekaService eurekaService;

	@RequestMapping(value = "/RibbonService")
	public String ribbonService(@RequestParam String name) {
		return eurekaService.eurekaService(name);
	}
}
