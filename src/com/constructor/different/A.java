package com.constructor.different;
//super class
public class A {
	String name; //java
	public A() {
		this("java");
		System.out.println("Class A-Super class-without Parameter constructor>>");
	}
	
	public A(String name) { //name contain java
		this.name=name;//java value will be assigned to name 
		System.out.println("Class A-Super class-with String Parameter constructor>>"+name);
	}

}
