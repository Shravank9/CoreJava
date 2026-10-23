package com.vcubelab_dailytest;

import java.util.Scanner;

public class Print_Prime_Numbers {
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number upto which you want print it");
		int a=sc.nextInt();
		int count=0;
		int number=2;
		while(a>count) {
			if(isprime(number)) {
				System.out.print(number+" ");
				count++;
			}
			number++;
			
		}
		sc.close();
		

	}

	private static boolean isprime(int i) {
		boolean status =true;
		
		if(i==1 || i==0 ) return false;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}

}



//Today's Assignment
//Java-
//1.Print the First N Prime Numbers
//Input : 10
//Output : 2 3 5 7 11 13 17 19 23 29
