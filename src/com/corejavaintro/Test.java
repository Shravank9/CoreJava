package com.corejavaintro;

public class Test {
	
	//static Test t=new Test();
	
	static {
		System.out.println("static loaded");
		Test t=new Test();
	}
	static Test t=new Test();
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Test t=new Test();

	}
	static {
		System.out.println("static loaded1");
		Test t=new Test();
	}
	//here instance block dont load in to the memory it needs to create the object refrence variable for it then it will be executed
	{
		System.out.println("instance loaded");
		//Test t=new Test();
	}
	static {
		System.out.println("static loaded2");
		Test t=new Test();
	}
	
	{
		System.out.println("instance loaded1");
		//Test t=new Test();
	}

}
