package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.constant.Url;

@Controller
public class LoginController {

	@GetMapping(Url.LOGIN)
	public String showLoginForm(Model model) {

		//		html内でUrlクラスの情報を利用する
		//		Url.〇〇で定数やメソッドへのアクセスが可能
		model.addAttribute(Url.class.getSimpleName(), Url.class);

		return Url.LOGIN;
	}

}
