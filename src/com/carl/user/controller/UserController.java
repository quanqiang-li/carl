package com.carl.user.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.carl.spring.common.datasource.DataSourceConstant;
import com.carl.spring.common.datasource.DataSourceContextHolder;
import com.carl.spring.common.web.BaseController;
import com.carl.user.model.User;
import com.carl.user.service.IUserService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("userController")
public class UserController extends BaseController{

	@Autowired
	private IUserService userService;
	
	/**
	 * 获取用户列表，普通的请求，并响应到一个页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getUser")
	public ModelAndView getUser(HttpServletRequest request,HttpServletResponse response){
		Map<String, List<User>> model = new HashMap<String, List<User>>();
		User record = new User();
		record.setSiteCode("wuhan");
		DataSourceContextHolder.setDataSourceType(DataSourceConstant.F_DS);//在进入service之前指定数据源，进入service之后就不会再改变
		List<User> users = userService.select(record);
		model.put("users", users);
		return new ModelAndView("user/userlist", model);
	}
	
	/**
	 * 获取用户列表，ajax或普通的请求，只回传结果，不指定页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getUser2")
	@ResponseBody
	public void getUser2(HttpServletRequest request,HttpServletResponse response){
		Map<String, List<User>> map = new HashMap<String, List<User>>();
		User record = new User();
		record.setSiteCode("wuhan");
		DataSourceContextHolder.setDataSourceType(DataSourceConstant.F_DS);//在进入service之前指定数据源，进入service之后就不会再改变
		List<User> users = userService.select(record);
		map.put("users", users);
		try {
			//以下方式二选一
			//response.getWriter().print(map);
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(response.getWriter(), map);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * restful风格的url，@PathVariable在变量名不一致时可用来对应关系，此时url后不能再跟？传参数了
	 * @param name
	 * @param age
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/getUser3/{name}/{age}")
	public ModelAndView getUser3(String name,@PathVariable("age") Integer age,HttpServletRequest request,HttpServletResponse response){
		System.out.println("name" + name);
		System.out.println("age" + age);
		Map<String, List<User>> model = new HashMap<String, List<User>>();
		User record = new User();
		record.setSiteCode("wuhan");
		DataSourceContextHolder.setDataSourceType(DataSourceConstant.F_DS);//在进入service之前指定数据源，进入service之后就不会再改变
		List<User> users = userService.select(record);
		model.put("users", users);
		return new ModelAndView("user/userlist", model);
	}
	
	/**
	 * mybatis分页拦截器的使用
	 * @param request
	 * @param response
	 */
	@RequestMapping("/getUser4")
	@ResponseBody
	public void getUser4(HttpServletRequest request,HttpServletResponse response){
		ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();

        String pageStart = request.getParameter("pageStart");
        String pageSize = request.getParameter("pageSize");

        PageHelper.startPage(Integer.parseInt(pageStart), Integer.parseInt(pageSize), true);
        User record = new User();
		record.setSiteCode("wuhan");
        List<User> users = userService.select(record);
        map.put("list", users);
        map.put("totalPage", ((Page) users).getPages());
        map.put("result", "success");

        try {
			mapper.writeValue(response.getWriter(), map);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
