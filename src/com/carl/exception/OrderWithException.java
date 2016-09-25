package com.carl.exception;

public class OrderWithException {

	public static void main(String[] args) {
		//System.out.println(RuntimeExceptionNoHandle());
		//System.out.println(RuntimeExceptionWithTry());
		System.out.println(RuntimeExceptionWithFinally());
	}
	
	/**
	 * 没有捕获的运行时异常，没有return值，在出错的那一行之后的语句都不会执行
	 * @return
	 */
	public static String RuntimeExceptionNoHandle(){
		int a = 0;
		double c = 10/a;//java.lang.ArithmeticException: / by zero
		System.out.println(c);
		return "我是RuntimeExceptionNoHandle末尾的return";
	}
	
	/**
	 * 在try中捕获的运行时异常，首先跳转到Catch中执行，然后再正常执行catch后面的语句
	 * 如果在catch里面有return，那么后面不能有任何语句，检查时异常会导致编译不通过
	 * 所以return只能二选一，要么在Catch中，要么在末尾，根据业务需求决定
	 * @return
	 */
	public static String RuntimeExceptionWithTry(){
		int a = 0;
		double c = 0;
		try {
			c = 10/a;
			return "我是RuntimeExceptionWithTry，try里面的return";
		} catch (Exception e) {
			e.printStackTrace();
			//如果在catch里面有return，那么后面的所有语句都不会被执行，检查时异常会导致编译不通过，所以return放在Catch中和放在末尾是一样的
			return "我是RuntimeExceptionWithTry，catch里面的return";
		}
		//System.out.println(c);
		//return "我是RuntimeExceptionWithTry末尾的return";
	}
	
	/**
	 * 在try中捕获的运行时异常，首先跳转到Catch中执行，然后再跳入finally中执行，最后执行末尾的语句
	 * 同样，不管是catch还是finally中有return，末尾都不能带有任何语句，编译不会通过
	 * return那条语句是最后执行的，如果Catch和Finally中都有return，
	 * 以Finally中的为最后有效执行，catch的return按普通语句执行，但不会返回结果
	 * 如果只有一条return，那么以该return位置为最后有效执行
	 * @return
	 */
	public static String RuntimeExceptionWithFinally(){
		int a = 0;
		double c = 0;
		try {
			c = 10/a;
			return "我是RuntimeExceptionWithFinally，try里面的return";
		} catch (Exception e) {
			System.out.println("我是catch");
			//e.printStackTrace();
			return "我是RuntimeExceptionWithFinally，catch里面的return";
		}finally{
			System.out.println("我是finally");
			return "我是RuntimeExceptionWithFinally，finally里面的return";
		}
		//如果在catch里面有return，那么后面的所有语句都不会被执行，检查时异常会导致编译不通过
		//System.out.println("我是末尾");
		//return "我是RuntimeExceptionWithFinally末尾的return";
	}
}
