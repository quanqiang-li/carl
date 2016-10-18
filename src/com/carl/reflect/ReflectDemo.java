package com.carl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//执行下面的语句，把硬盘上的class文件加载到内存中来，字节码存储,三种方式
		Class clazz = Class.forName("com.carl.reflect.ReflectClass");
		Class clazz1 = Person.class;
		Class clazz2 = new Person().getClass();
		
	}

	//反射构造方法
	@Test
	public void test1() throws  Exception{
		Class clazz = Class.forName("com.carl.reflect.Person");	
		//public
		Constructor constructor = clazz.getConstructor(String.class);//反射有参数的构造方法
		Person p = (Person) constructor.newInstance("zhangsan");//执行构造方法，实例化一个对象
		System.out.println(p.getName());
		//private
		Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class,int.class);
		declaredConstructor.setAccessible(true);//私有的构造方法不可以在外部访问，但是反射是可以的，加这句话
		Person p2 = (Person) declaredConstructor.newInstance("李四",10);
		System.out.println(p2.getName());
		
	}
	
	//反射普通方法
	@Test
	public void test2() throws  Exception{
		Class clazz = Class.forName("com.carl.reflect.Person");	
		Object newInstance = clazz.newInstance();
		Method getName = clazz.getMethod("getName", null);
		Method setName = clazz.getMethod("setName", String.class);
		Method declaredMethod = clazz.getDeclaredMethod("", null);//private method
		setName.invoke(newInstance, "张三");
		System.out.println(getName.invoke(newInstance, null));
	}
	
	//反射main方法，接受参数为数组
	@Test
	public void test3() throws  Exception{
		Class clazz = Class.forName("com.carl.reflect.Person");	
		Object newInstance = clazz.newInstance();
		Method main = clazz.getMethod("main", String[].class);//main方法，参数数组
		//main.invoke(null, (Object)new String[]{"aa","bb"});//可变参数，执行时会拆分,等同于执行main(String aa,String bb)
		main.invoke(null, new Object[]{new String[]{"aa","bb"}});//避免直接传数组被拆分，外面包装一层数组
		main.invoke(null, (Object)new String[]{"aa","bb"});//避免直接传数组被拆分，外面声明是个对象，欺骗编译器
	}
	
	//反射字段
	@Test
	public void test4() throws  Exception{
		Class clazz = Class.forName("com.carl.reflect.Person");	
		Object newInstance = clazz.newInstance();
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		field.set(newInstance, "王五");
		Object object = field.get(newInstance);
		Class type = field.getType();
		if(type.equals(String.class)){
			String value = (String)object;
			System.out.println(value);
		}
	}
}
