package com.carl.spring.web.mvc;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("CarlController")
public class CarlController {

	@RequestMapping("/test")
	public ModelAndView test(){
		
		return new ModelAndView("test", new HashMap<String, Object>());
	}
}
