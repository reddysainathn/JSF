package com.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	
	public LoginBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String processRequest(){
		
		System.out.println("****processRequest()****");
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		
		return "success";
		
		
		
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
