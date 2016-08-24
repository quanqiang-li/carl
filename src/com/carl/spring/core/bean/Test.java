package com.carl.spring.core.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("services.xml");
		Scope bean = ctx.getBean("scope1",Scope.class);
		Scope bean1 = ctx.getBean("scope1",Scope.class);
		System.out.println(bean==bean1);
	}
}
