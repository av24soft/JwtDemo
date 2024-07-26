package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/helloAdmin")
	public String helloAdmin() {
		return "hello admin";
	}

	@GetMapping("/helloUser")
	public String helloUser() {
		return "hello user";
	}

}
