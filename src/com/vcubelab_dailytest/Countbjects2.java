package com.vcubelab_dailytest;

public class Countbjects2 {

	
	static int count=0;
	
	{
		count++;
	}
	public static void main(String[] args) {
		
		Countbjects2 t=new Countbjects2();
		Countbjects2 t1=new Countbjects2();
		Countbjects2 t2=new Countbjects2();
		Countbjects2 t3=new Countbjects2();
		Countbjects2 t4=new Countbjects2();
		
		System.out.println("No.of Objects:"+count);

	}

}
