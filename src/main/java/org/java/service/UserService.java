package org.java.service;

import org.java.entity.User;

public interface UserService {
	//验证登录
	public Boolean login(User user);
}
