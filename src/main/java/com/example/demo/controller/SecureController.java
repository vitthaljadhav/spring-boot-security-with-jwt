package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v4")
public class SecureController {

	@GetMapping(value = "/secure")
	public String getSecure() {
		return "This is Secure Api...";

	}
}
