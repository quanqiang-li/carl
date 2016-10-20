package com.carl.reflect;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;
/**
 * 内省
 * @author liqq
 *
 */
public class TestIntrospector {

	//属性
	@Test
	public void test1() throws Exception{
		//BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);//包含父类继承的属性
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class,Object.class);//去掉父类继承的属性
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor property : propertyDescriptors){
			System.out.println(property.getName());
		}
	}
	//读写
	@Test
	public void test2() throws Exception{
		Person p = new Person();
		PropertyDescriptor property = new PropertyDescriptor("name", Person.class);
		Method writeMethod = property.getWriteMethod();
		writeMethod.invoke(p, "王五");
		
		Method readMethod = property.getReadMethod();
		System.out.println(readMethod.invoke(p, null));
	}
}
