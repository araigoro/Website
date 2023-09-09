package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.Url;
import com.example.demo.form.SignupForm;
import com.example.demo.form.Validation.ValidOrder;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//Autowiredは廃止になるので以下を追加し、フィールドにはprivate final で宣言
@RequiredArgsConstructor
public class SignupController {

	private final UserService userService;
	private final ModelMapper modelMapper;

	@GetMapping(Url.SIGNUP)
	public String showSignupForm(Model model, @ModelAttribute SignupForm signupForm) {

		//html内でUrlクラスの情報を利用する
		//Url.〇〇で定数やメソッドへのアクセスが可能
		model.addAttribute(Url.class.getSimpleName(), Url.class);

		return Url.SIGNUP;
	}

	@PostMapping(Url.SIGNUP)
	public String signup(Model model, @ModelAttribute @Validated(ValidOrder.class) SignupForm signupForm,
			BindingResult bindingResult) {

		model.addAttribute(Url.class.getSimpleName(), Url.class);

		//登録内容が以下の場合は無効
		//ユーザID：空白を含む
		//パスワード：4文字以下
		if (bindingResult.hasErrors()) {
			return showSignupForm(model, signupForm);
		}

		log.info(signupForm.toString());

		//signupFormの内容をコピーしUserクラスに変換
		//変換してからserviceに渡すメリット
		//・formに変更があってもサービスを修正しなくていい
		//・他の画面からもサービスを利用できる
		User user = modelMapper.map(signupForm, User.class);
		userService.signup(user);

		//同じリクエストが送られないようリダイレクトする(PRGパターンで検索)
		return Url.redirect(Url.LOGIN);
	}

}
