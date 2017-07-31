package org.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.java.entity.User;

public interface UserDao {
	
	//查询获取所有用户
	List<User> getAllUsers();
	
	//按用户名和密码进行登陆查询
	int login(User user);
}
