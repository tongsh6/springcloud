package com.loong.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserNameController {
	@Value("${username}")
	String username;

	@RequestMapping(value = "/GetUserName")
	public String getUserName() {
		return username;
	}
}
