package com.corejavaintro;

public class ClassLoader {

	public static void main(String[] args) throws ClassNotFoundException {
	
		//bootstarp classess
	 System.out.println("hi this Shravan ");
		//bootstarp classess
	 Class.forName("java.lang.String");
	 Class.forName("java.lang.System");
	 System.out.println("wow it great to meet u");
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("ended main program");

	}
	

}
