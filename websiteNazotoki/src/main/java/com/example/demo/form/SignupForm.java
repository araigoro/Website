package com.example.demo.form;

import org.hibernate.validator.constraints.Length;

import com.example.demo.form.Validation.ValidBlank;
import com.example.demo.form.Validation.ValidLength;
import com.example.demo.form.Validation.ValidPattern;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * ユーザ登録画面で入力する値を保持するクラス
 */
@Data
public class SignupForm {

	@NotBlank(groups = ValidBlank.class)
	@Length(max = 30, groups = ValidLength.class)
	@Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidPattern.class)
	private String userName;

	@NotBlank(groups = ValidBlank.class)
	@Length(min = 4, max = 30, groups = ValidLength.class)
	@Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidPattern.class)
	private String password;

}
