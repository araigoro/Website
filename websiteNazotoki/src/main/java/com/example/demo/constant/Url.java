package com.example.demo.constant;

/**
 * アプリケーション内で使用するURLの管理<br>
 * 定数にはhtmlのtemplates以降のパスを記載<br>
 * Enumも考えたがGetMappingなどのvalueに値を利用できなかったため諦めた<br>
 * インターフェースで定義する方法は本来の役割と違うと思ったのでやめた
 */
public class Url {

	//	インスタンス生成は必要ないため禁止
	private Url() {
	}

	/**
	 * login.htmlはtemplates直下
	 */
	public static final String LOGIN = "/login";

	/**
	 * signup.htmlはtemplates直下
	 */
	public static final String SIGNUP = "/signup";

	/**
	 * 特定のURLに自動転送したい場合、URLの頭につける
	 */
	private static final String REDIRECT = "redirect:";

	/**
	 * リダイレクト先のURLを組み立てる
	 * @param url
	 * @return リダイレクトURL
	 */
	public static String redirect(String url) {
		return REDIRECT + url;
	}

}
