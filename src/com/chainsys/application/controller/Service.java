package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Service {
	@RequestMapping("/welcome") //this method
	public String welcomePage() {
		return "<h1>Welcome</h1>";
	}
	@RequestMapping("/home")
	public String homePage() {
		String html ="<div>Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can \"just run\". </div>";
		return html;
	}
	@RequestMapping("getdata")
	public String getData(@RequestParam(value ="city",defaultValue="madurai") String city) {
		return "<h1>Welcome to  "+city+"</h1>";
	}
}
