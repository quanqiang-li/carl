package com.carl.annotation.method;
/**
 * 3.使用方式
 * @author aisino
 *
 */
public class HelloWorldStub {

	@HelloWorldAnnotation(name = "小明")
	public String sayHello(String name) {
		if (name == null ) {
			name = "";
		} 		
		return name + " say hello world!";
	}
}
