package com.carl.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.carl.user.model.User;
import com.carl.user.service.IUserService;

@Controller
@RequestMapping("userController")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("getUser")
	public ModelAndView getUser(HttpServletRequest request,HttpServletResponse response){
		Map<String, List<User>> model = new HashMap<String, List<User>>();
		User record = new User();
		record.setSiteCode("wuhan");
		List<User> users = userService.select(record);
		model.put("users", users);
		return new ModelAndView("user/userlist", model);
	}
}
