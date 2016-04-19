package com.integration.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserQueryAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<User> userlist=userService.findAll();
		ServletActionContext.getRequest().setAttribute("userlist", userlist);
		return "SUCCESS";
	}
}
