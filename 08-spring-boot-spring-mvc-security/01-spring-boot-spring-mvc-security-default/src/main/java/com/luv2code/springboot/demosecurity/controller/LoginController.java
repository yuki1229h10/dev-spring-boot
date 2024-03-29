package com.luv2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ログイン関連の制御を処理する
 * @author Yuki
 */
@Controller
public class LoginController {

	/**
	 * ログインページを表示する
	 * @return plain-login.htmlを表示する
	 */
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {

		return "fancy-login";
	}

	/**
	 * アクセス拒否ページを表示する
	 * @return access-denied.htmlを表示する
	 */
	@GetMapping("/access-denied")
	public String showAccessDenied() {

		return "access-denied";
	}
}
