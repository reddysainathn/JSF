package com.action.customer;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vo.Register;

public class RegisterAction extends ActionSupport  implements ModelDriven<Register>{
	
	
	

//	private String username;
//	private String firstname;
//	private String lastname;
//	private String email;
//	private String phone;
	private Register  register = new Register();
	
	//It is a Model Driven Approach which is used by Structs2 Framework
	//Sharing Data with Other Objects is Lot easier
	@Override
	public Register getModel() {
		// TODO Auto-generated method stub
		
		return register;
	}
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Customer Module RegisterAction:Execute()");
		
		System.out.println("Username  :"+register.getUsername());
		System.out.println("Firstname :"+register.getFirstname());
		System.out.println("Lastname  :"+register.getLastname());
		System.out.println("Email     :"+register.getEmail());
		System.out.println("Phone     :"+register.getPhone());
		
		return "success";
	}



//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

}
