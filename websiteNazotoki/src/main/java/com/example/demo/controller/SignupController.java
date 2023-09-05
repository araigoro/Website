package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.Url;

@Controller
public class SignupController {

	@GetMapping(Url.SIGNUP)
	public String showSignupForm() {
		return Url.SIGNUP;
	}

	@PostMapping(Url.SIGNUP)
	public String signup() {

		//同じリクエストが送られないようリダイレクトする(PRGパターンで検索)
		return Url.redirect(Url.LOGIN);
	}

}
