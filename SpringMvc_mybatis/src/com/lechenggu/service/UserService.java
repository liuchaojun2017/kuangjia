package com.lechenggu.service;

import java.util.List;

import com.lechenggu.bean.User05;

public interface UserService {
	
	public User05 login(User05 u);
	
	public List<User05> userList();
}
