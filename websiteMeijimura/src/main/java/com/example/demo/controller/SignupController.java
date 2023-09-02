package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.URL;

@Controller
public class SignupController {

	@GetMapping(URL.SIGNUP)
	public String showSignupForm() {
		return URL.SIGNUP;
	}

	@PostMapping(URL.SIGNUP)
	public String signup() {
		
		//同じリクエストが送られないようリダイレクト(PRGパターン)
		return URL.REDIRECT + URL.LOGIN;
	}

}
