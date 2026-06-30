package com.vcubelab_dailytest;

public class nullifyingobject {
	@Override
	protected void finalize() throws Throwable {
       System.out.println("Object destroyed");		
       super.finalize();
	}

	public static void main(String[] args) {
		
		
    nullifyingobject t=new nullifyingobject();
    System.out.println(t);//adress of the obect in hexa decimal
    System.out.println(t.hashCode());//it is hexadecimal into int value it gives direct value
    
   int a=0x2b2fa4f7;
   System.out.println(a);
    
    nullifyingobject t1=new nullifyingobject();
    System.out.println(t1);
    System.out.println(t1.hashCode());
    
    nullifyingobject t2=new nullifyingobject();
    System.out.println(t2);
    System.out.println(t2.hashCode());
    
    
    t=null;
    t1=null;
    
    
    System.gc();
    System.out.println(t);
    System.out.println(t1);
    
    

 
	}

}


/*
 * Today Task Java
 * 
 * Question: Garbage Collection Using Nullification
 * 
 * 1.Problem Statement: Write a Java program to demonstrate garbage collection
 * using nullification.
 * 
 * Requirements: 1.Create a class named Employee. 2.Create an object of the
 * Employee class. 3.Assign null to the object reference. 4.Invoke the garbage
 * collector using System.gc(). 5.Override the finalize() method to display a
 * message when the object is garbage collected.
 * 
 * Expected Output: Object is eligible for Garbage Collection Garbage Collector
 * Called
 */