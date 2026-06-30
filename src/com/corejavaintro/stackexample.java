package com.corejavaintro;

public class stackexample {

	public static void main(String[] args) {
		System.out.println("Let's Started");
		hi();
		stackexample t=new stackexample();
		t.hello();
		

	}
	 static void hi() {
		 stackexample t=new stackexample();
		 t.hello();
		 System.out.println("static block1");
		 
	 }
	 //lrys started,
	 
	 void hello() {
		 hello1();
		 System.out.println("instance block1");
	 }
	 
	 
     void hello1() {
		 hi1();
		 System.out.println("instance block2");
		 
	 }

    static void hi1() {
    	
	 System.out.println("static block2");
	 
}

}
