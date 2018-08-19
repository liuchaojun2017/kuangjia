package com.lechenggu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lechenggu.bean.User05;

public class TestMy {
	@Test
	public void get(){
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession Sn = build.openSession();
		User05 ue=new User05();
		ue.setName("lisi");
		ue.setAge(16);
		User05 u  = Sn.selectOne("User.login",ue);
		System.out.println(u.getAge());
	}
}
