package com.carl.enumpackage;

public enum Grade {

	A("优","90-100"),B("良","70-90");
	private String arg1;
	private String arg2;
	private Grade(String arg1,String arg2){
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	public String getArg1() {
		return arg1;
	}
	public String getArg2() {
		return arg2;
	}
	public static void main(String[] args) {
		System.out.println(Grade.A.name());//枚举的变量名称
		System.out.println(Grade.A.ordinal());//枚举的索引
		System.out.println(Grade.valueOf("B").name());//把一个字符串转变成枚举，必须能匹配上枚举的变量名称
		System.out.println(Grade.values()[0].getArg1());//values遍历枚举，得到数组
	}
}


/*class Grade{ 
	public static final Grade A = new Grade("优","90-100");
	public static final Grade B = new Grade("良","70-90");
	private String arg1;
	private String arg2;
	private Grade(String arg1,String arg2){
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public String getArg1() {
		return arg1;
	}
	public String getArg2() {
		return arg2;
	}

}*/
