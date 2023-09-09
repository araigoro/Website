package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

/**
 * DBへアクセスする機能を実装するためのインターフェース
 */
@Mapper
public interface UserMapper {

	/**
	 * @param user
	 * userテーブルへ新規登録
	 */
	public int insertUser(User user);

}
