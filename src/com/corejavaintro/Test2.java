package com.corejavaintro;

public class Test2 {
	

	public static void main(String[] args) {
		
           System.out.println("main method");
           Welcome();
           Test2 t=new Test2();
           t.Hello();
	}
	// see it will not excute until the method is called and more thing was it loads to memory when the it excutes 
	public static void Welcome() {
		System.out.println("static method");
	}
	
	// see it will not excute until the method is called and more thing  it doesnt loads to memory until the obkect cretaion sis not yet done 
	void Hello() {
		System.out.println("hi guys, welcome to my world!");
	}

}
