package com.example.demo.service;

import com.example.demo.model.User;

/**
 * ユーザサービスインターフェース
 */
public interface UserService {

	/**
	 * @param user
	 * DBのユーザテーブルへinsertする
	 */
	public void signup(User user);

}
