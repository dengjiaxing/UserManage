package com.integration.action;

import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		userService.deleteUser(id);
		return SUCCESS;
	}

}
