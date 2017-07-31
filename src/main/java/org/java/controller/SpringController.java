package org.java.controller;

import javax.servlet.http.HttpServletRequest;

import org.java.entity.User;
import org.java.mapper.UserDao;
import org.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class SpringController {

	@Autowired
	UserService userService;
	@Autowired
	UserDao userMapper;

	@RequestMapping(value = "/")
	public String login() {
		return "Echarts";
	}

	@RequestMapping("/Userlogin")
	//@ResponseBody
	public String Userlogin(HttpServletRequest request,Model model) {
		User u = new User();
		u.setName(request.getParameter("name"));
		u.setPassword(request.getParameter("password"));
		u.setType(1);
//		Boolean flag = userService.login(u);
//		if (flag == true) {
//			model.addAttribute("name",u.getName());
//			model.addAttribute("password",u.getPassword());
//			model.addAttribute("type",u.getType());
//			return "success";
//		} else {
//			return "failed";
//		}
		int i = userMapper.login(u);
		if (i == 1) {
			model.addAttribute("name", u.getName());
			model.addAttribute("password", u.getPassword());
			model.addAttribute("type", u.getType());
			return "success";
		} else {
			return "failed";
		}
	}
}
