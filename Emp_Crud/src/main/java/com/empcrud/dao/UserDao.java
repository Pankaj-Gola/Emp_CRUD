package com.empcrud.dao;

import com.empcrud.entity.User;

public interface UserDao {

	public int saveUser(User user);

	public User loginUser(String email, String password);
}
