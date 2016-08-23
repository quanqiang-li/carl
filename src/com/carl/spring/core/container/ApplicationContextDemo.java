package com.carl.spring.core.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextDemo {


	
	/**
	 * 初始化spring容器
	 */
	void initContainer(){
		//classpath对应的位置就是src下的目录
		ApplicationContext context1 = new ClassPathXmlApplicationContext("conf/services.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext(new String[] {"services.xml","conf/services.xml"});//同时加载多个文件
		//FileSystem加载的是项目根目录下得conf文件夹下的
		ApplicationContext context3 = new FileSystemXmlApplicationContext("conf/services.xml");
		ApplicationContext context4 = new FileSystemXmlApplicationContext("classpath:conf/services.xml");//可以指定使用classpath加载资源，那么位置在src下
	}

	/**
	 * 使用容器
	 */
	void useContainer(){
		ApplicationContext context1 = new ClassPathXmlApplicationContext("services.xml");
		PetStoreService service = context1.getBean("petStore", PetStoreService.class);
		PetStoreService service2 = context1.getBean("petStore1", PetStoreService.class);
		System.out.println(service == service2);
	}


	public static void main(String[] args) {
		ApplicationContextDemo demo = new ApplicationContextDemo();
		demo.useContainer();
	}
}
