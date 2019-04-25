package com.service.demoservicearchitechture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.demoservicearchitechture.config.MultiService;

@RestController
public class ProxyServiceController {
	
	@Autowired
	private MultiService multiService;
	
	@RequestMapping("/route")
	public String routeService(@RequestHeader(value="service") String service) {
		if(service.equalsIgnoreCase("hello")) {
			System.err.println(multiService.toString());
		}
		return "Hello";
	}

}
