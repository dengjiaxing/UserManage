package com.integration.action;

import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		if (userService.findUserById(user.getId())!=null) {
			setUser(user);
			userService.updateUser(user);
			return SUCCESS;
		}
		addActionMessage(getText("error.message.not.exist"));
		return "INPUT";
	}
}
