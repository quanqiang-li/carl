package com.carl.generic;
/**
 * 泛型
 * @author carl
 *
 */
//类上做了声明，方法就不用再声明，直接用
public class GenericDemo<W> {

	public <T>  void a(T t){
		//自定义泛型方法，先声明，才可以用
	}
	public <T,k,v>  void b(T t){
		//自定义泛型方法，多个参数
	}
	public  void c(W w){
		//自定义泛型方法，使用类声明
	}
	public static <E> void d(E e){
		//静态方法需要自己声明
	}
}
