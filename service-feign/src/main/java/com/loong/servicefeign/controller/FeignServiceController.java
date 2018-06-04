package com.loong.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loong.servicefeign.service.FeignService;

//自己发布的接口
@RestController
public class FeignServiceController {
	@Autowired
	FeignService feignService;

	@RequestMapping(value = "/feignService", method = RequestMethod.GET)
	public String feignQuery(@RequestParam String name) {
		//将要调用的被负载均衡的接口
		return feignService.eurekaService(name);
	}
}
