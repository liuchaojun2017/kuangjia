package com.lechenggu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechenggu.bean.User05;
import com.lechenggu.mapper.User05Mapper;
import com.lechenggu.service.UserService;

@Service("UserServiceIpml")
public class UserServiceIpml implements UserService{
	@Autowired
	private User05Mapper us;
	@Override
	public User05 login(User05 u) {
		// TODO Auto-generated method stub
		u.setAge(16);
		u.setName("lisi");
		User05 s= us.login(u);
		return s;
	}


	@Override
	public List<User05> userList() {
		// TODO Auto-generated method stub
		List<User05> u =us.userList();
		return u;
	}
	
}
