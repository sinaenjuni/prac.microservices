package com.miscroservices.practicce.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miscroservices.practicce.limitservice.bean.Limits;
import com.miscroservices.practicce.limitservice.configuration.Configuration;

@RestController
public class LImitsContoller {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
//		return new Limits(1, 1000);
	}
}
