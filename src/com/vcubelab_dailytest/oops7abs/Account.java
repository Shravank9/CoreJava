package com.vcubelab_dailytest.oops7abs;

public abstract class Account {
	
	static void hello() {
		System.out.println("Hello");
	}
	
	void welcome() {
		System.out.println("Hi welcome to v banking sector");
	}
	abstract void calculateInterest();
	

}
//Today's Assignment
//
//Java-
//1.Create an abstract class Account with a 
//static method, concrete method, and abstract method. Create two subclasses 
//and determine which methods can be accessed using the class name and which require an object.