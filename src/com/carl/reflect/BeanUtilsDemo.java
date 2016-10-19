package com.carl.reflect;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.configuration.ConversionException;
import org.junit.Test;

public class BeanUtilsDemo {

	@Test
	public void test() throws Exception{
		Person p = new Person();
		
		//默认支持8大基础类型，其他类型需要自己注册转换类
		ConvertUtils.register(new Converter() {
			
			@Override
			public Object convert(Class arg0, Object arg1) {
				if(null == arg1){
					return null;
				}
				if(!(arg1 instanceof String)){
					throw new ConversionException("不支持的类型");//api建议跑出这个异常
				}
				String value = (String) arg1;
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				try {
					return df.parse(value);
				} catch (ParseException e) {
					throw new RuntimeException(e);//异常连不能断
				}
			}
		}, Date.class);
		
		BeanUtils.setProperty(p, "name", "张三");//设置属性
		System.out.println(p.getName());
	}
	//map填充到对象
	@Test
	public void test2() throws Exception{
		Person p = new Person();
		Map map = new HashMap();
		map.put("name", "李四");
		BeanUtils.populate(p, map);
		System.out.println(p.getName());
	}
}
