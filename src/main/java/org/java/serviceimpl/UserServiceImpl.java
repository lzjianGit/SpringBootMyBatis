package org.java.serviceimpl;

import org.java.entity.User;
import org.java.mapper.UserDao;
import org.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public Boolean login(User user) {
		int i = userDao.login(user);
		//user.getName().equals("lzjian") && user.getPassword().equals("q123")
		if(i > 0){
			return true;
		}else{
			return false;
		}
	}

}
