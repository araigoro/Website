package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * ユーザサービス実装クラス
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserMapper userMapper;

	@Override
	public void signup(User user) {
		userMapper.insertUser(user);
	}

}
