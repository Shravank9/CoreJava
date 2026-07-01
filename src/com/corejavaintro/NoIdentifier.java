package com.corejavaintro;

public class NoIdentifier {
	int id;
	static String c="arun";
	
	void method() {
		System.out.println("hi");
	}
	

	public static void main(String[] args) {
		
		System.out.println("main started");
		NoIdentifier t=new NoIdentifier();
		t.id=121;
		System.out.println("Value:"+t.id);
		t.method();
        System.out.println("main method ended");


	}

}
