package com.constructor.same;

public class Example {

	public Example() {
		this(25);
		System.out.println("Constructor without Parameter>>");
	}

	public Example(int a) { //a contain 25
		this("velocity");
		System.out.println("Constructor with int parameter>>" + a);
	}

	public Example(String s) { //s contain velocity
		System.out.println("Constructor with string parameter>>" + s);
	}
	
	public static void main(String[] args) {
		
		Example example=new Example();
	}
}
