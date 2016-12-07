package com.carl.annotation.method;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 4.测试使用效果
 * @author aisino
 *
 */
public class TestHelloWorldAnnotation {
	@Test
	public void testHello() throws Exception {

		// 定义操作类
		ParseAnnotationStub parse = new ParseAnnotationStub();

		// 假设我们知道类HelloWorldStub使用了注解，执行HelloWorldStub中带注解的方法
		// 判断是否使用了注解的name()方法，设置name = "小明"，并返回"小明 say hello world!"
		String returnValue = parse.parseMethod(HelloWorldStub.class);
		System.out.println(returnValue);
		assertEquals("小明 say hello world!", returnValue);

	}
}
