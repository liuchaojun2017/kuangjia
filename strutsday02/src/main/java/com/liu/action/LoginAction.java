package com.liu.action;

import java.util.Arrays;

public class LoginAction {

	@Override
	public String toString() {
		return "LoginAction [username=" + username + ", pwd=" + pwd + ", ai=" + Arrays.toString(ai) + "]";
	}

	private String username;
	private String pwd;
	private String[] ai;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String[] getAi() {
		return ai;
	}

	public void setAi(String[] ai) {
		this.ai = ai;
	}

	public String execute(){
		System.out.println(this);
		return "success";
	}
}
