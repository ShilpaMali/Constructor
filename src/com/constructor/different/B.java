package com.constructor.different;

public class B extends A{
	public B() {
		System.out.println("Class B-Sub class-without Parameter constructor>>");
	}
	
	public B(String name) { //velocity
		//super(name); //super(name); //velocity
		//super(); invisibly present
		System.out.println("Class B-Sub class-with String Parameter constructor>>"+name);
	}

}
