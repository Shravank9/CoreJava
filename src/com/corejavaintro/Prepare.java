package com.corejavaintro;

public class Prepare {
	
	//static variables 
	static int clgid=12;
	static  String clgname="kumar";
	
	//instance variables
	int  sid=13;
	String sname="kumari";

	public static void main(String[] args) {
		//initailzation for static
		clgid=22;
		clgname="sura";
		
	
		
		//accessing the static varibles in main method
		System.out.println("clgid:"+ clgid);
		System.out.println("clgname:"+ clgname);
		//accessing the instance variables in  main method,not excetued gets error like Cannot make a static reference to the non-static field sid,sname
		//means  u r accessing the instance variables in static  without creating the object creation  referance variable ,then it will get error like above sentence, then should create object for instance variable them it will be excuted
        
		
		Prepare s1=new Prepare();//object creation for instance variable ,prepare() is constructor calling means creation of the object for a class
		
		//intialzation values for the instance variables
		s1.sid=57;
	    s1.sname="shiva";
				
		System.out.println("sid:"+s1.sid);
		System.out.println("sname:"+s1.sname);
	  
		System.out.println("................................");
		
        //accessing the static varibles directlu ,using class and using  object refernce variable
		//directly accesing static variables
		System.out.println("clgid:"+clgid);
		System.out.println("clgname:"+clgname);
		
		//using class
		System.out.println("clgid:"+Prepare.clgid);
		System.out.println("clgname:"+Prepare.clgname);
		
		//using object variable refrence
		System.out.println("clgid:"+s1.clgid);
		System.out.println("clgname:"+s1.clgname);
		
		System.out.println("....................................");
		//accessing the instance variables can only throung objcer refence variable
		
		System.out.println("sid:"+s1.sid);
		System.out.println("sname:"+s1.sname);
		
		
		
		
		
	}

}
