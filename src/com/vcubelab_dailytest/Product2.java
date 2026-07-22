package com.vcubelab_dailytest;

public class Product2 {
	int a;
	int b;
	void display() {
		 int c=a+b;
		 System.out.println("value is the :"+c);
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");

        Object t = new Product2();

        ((Product2) t).a = 264;
        ((Product2) t).b = 290;

        ((Product2) t).display();
		System.out.println("main method ended");


	}

}
