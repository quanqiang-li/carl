package com.carl.reflect;

public class Person {
	
	private String name;

	public Person (){
		System.out.println("null");
	}
	
	public Person (String name){
		this.name = name;
		System.out.println(name);
	}
	
	private Person (String name,int age){
		this.name = name;
		System.out.println(name+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	
}
