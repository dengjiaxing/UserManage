package com.integration.action;

import java.util.Iterator;
import java.util.List;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String usertype;
	public String getUsername() {
		return username;
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
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<User> list=userService.findAll();
		User u=new User();
		Iterator<User> it=list.iterator();
		while(it.hasNext()){
			u=it.next();
			if (username.trim().equals(u.getName())&&password.trim().equals(u.getPassword())
					&& usertype.trim().equals(u.getType())) {
				return "success";
			}
			else {
				return "failer";
			}
		}
		String page="failer";
		return page;
	}
}
