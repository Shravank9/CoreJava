package com.vcubelab_dailytest;

import java.util.Scanner;

public class Perfect_Number {
	
	boolean isPerfect(int a){
		
	     boolean b = false;
	     int sum=0;
	     for(int i=1;i<a;i++) {
	    	 
	    	 if(a%i==0) {
	    		 sum+=i; 
	    	 }
	    	    	 
	     }
	     if(sum==a) {
	    	 b=true;
	     }
	  return b;
		
	}

	 void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Your Number:");
		int a=sc.nextInt();
		
		boolean status=isPerfect(a);
		if(status) {
			System.out.println("The given number is Perfect Number");
		}else {
			System.out.println("The given number is not a perfect Number");
		}
		

	}

}



