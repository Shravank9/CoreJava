/*Today Assignment
Java
1. Count the no of objects in a class using instance and static data?*/


package com.vcubelab_dailytest;
public class Countbjects {
	 
	static int count=0;
	int id;

	public static void main(String[] args) {
		
		Countbjects t=new Countbjects();
		count++;
		
		Countbjects t1=new Countbjects();
		count++;


		Countbjects t2=new Countbjects();
		count++;


		Countbjects t3=new Countbjects();
		count++;
         
		System.out.println("No.of Objects:"+count);


	}

}
