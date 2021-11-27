package com.miscroservices.practicce.limitservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miscroservices.practicce.limitservice.bean.Limits;

@RestController
public class LImitsContoller {
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(1, 1000);
	}
}
