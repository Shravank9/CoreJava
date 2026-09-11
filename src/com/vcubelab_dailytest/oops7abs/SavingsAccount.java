package com.vcubelab_dailytest.oops7abs;

public class SavingsAccount extends Account{

	@Override
	void calculateInterest() {
		double roi=8.5;
		
		System.out.println("Savings Account Interest:"+roi+"%");
		
	}

}
//Today's Assignment
//
//Java-
//1.Create an abstract class Account with a 
//static method, concrete method, and abstract method. Create two subclasses 
//and determine which methods can be accessed using the class name and which require an object.