package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.constant.URL;

@Controller
public class LoginController {

	@GetMapping(URL.LOGIN)
	public String showLoginForm() {
		return URL.LOGIN;
	}

}
