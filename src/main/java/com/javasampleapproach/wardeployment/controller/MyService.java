package com.javasampleapproach.wardeployment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@RequestMapping("/Hello")
	public String hello()
	{
		return "Hello";
	}
	
}
