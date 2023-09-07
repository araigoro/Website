package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.Url;
import com.example.demo.form.SignupForm;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SignupController {

	@GetMapping(Url.SIGNUP)
	public String showSignupForm(Model model, @ModelAttribute SignupForm signupForm) {

		//html内でUrlクラスの情報を利用する
		//Url.〇〇で定数やメソッドへのアクセスが可能
		model.addAttribute(Url.class.getSimpleName(), Url.class);

		return Url.SIGNUP;
	}

	@PostMapping(Url.SIGNUP)
	public String signup(Model model, @ModelAttribute SignupForm signupForm) {

		model.addAttribute(Url.class.getSimpleName(), Url.class);

		log.info(signupForm.toString());

		//同じリクエストが送られないようリダイレクトする(PRGパターンで検索)
		return Url.redirect(Url.LOGIN);
	}

}
