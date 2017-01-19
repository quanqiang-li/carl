package com.carl.spring.web.mvc;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("CarlController")
public class CarlController {

	@RequestMapping("/test")
	public ModelAndView test(HttpServletRequest request,HttpServletResponse response){
		request.getParameter("");
		String remoteAddr = request.getRemoteAddr();
		Enumeration headerNames = request.getHeaderNames();
		
		// 通过请求头获取ip地址
		String ip = request.getHeader("x-forwarded-for");
		// 判断ip地址是否是代理地址
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		    ip = request.getHeader("Proxy-Client-IP");
		}
		// 判断ip地址是否是代理地址
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		    ip = request.getHeader("WL-Proxy-Client-IP");
		}
		// 判断ip地址是否是代理地址
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		    ip = request.getRemoteAddr();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ip", ip);
		return new ModelAndView("test",map);
	}
	
	@RequestMapping("/error")
	public ModelAndView error(HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> map = new HashMap<String, Object>();
		String remoteAddr = request.getRemoteAddr();
		map.put("ip", remoteAddr);
		int a = 0;
		//double  c = 10/0;//为了抛出一个运行时异常
		return new ModelAndView("error/error",map);
	}
}
