package com.integration.service;

import java.util.List;

import com.integration.entity.User;

public interface UserService {
	void saveUser(User user);
	List<User> getUser(String name);
	void deleteUser(int id);
	void updateUser(User user);
	User findUserById(int id);
	List<User> findAll();
}
