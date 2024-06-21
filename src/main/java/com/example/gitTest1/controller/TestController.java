package com.example.gitTest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String getIndex() {
		System.out.println("index Start");
		return "index";
	}
	
}
