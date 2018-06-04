package com.loong.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//被负载均衡的接口
@FeignClient(value = "eureka-client-service", fallback = ServiceHystric.class) // eureka服务名
public interface FeignService {
	// value是发布的接口名
	@RequestMapping(value = "/EurekaService", method = RequestMethod.GET)
	String eurekaService(@RequestParam(value = "name") String name);
}
