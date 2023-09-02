package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/hello")
	public String getHello() {
		return "test/hello";
	}

	@GetMapping("/test")
	public String getTest() {
		return "test/test";
	}
}
