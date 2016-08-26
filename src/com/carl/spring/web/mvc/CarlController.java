package com.carl.spring.web.mvc;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarlController {

	
	public ModelAndView test(){
		
		return new ModelAndView("", new HashMap<String, Object>());
	}
}
