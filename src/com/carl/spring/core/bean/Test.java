package com.carl.spring.core.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("services.xml");
		ClientService bean = ctx.getBean("clientService",ClientService.class);
		System.out.println(bean);
	}
}
