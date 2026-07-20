
package com.vcubelab_dailytest;
import java.util.Scanner;

public class CalculatorProgram {
	
	int add(int a ,int b) {
		return a+b;
		
	}
	int subtract(int a,int b) {
		return (a-b);
	}
	int multiply(int a ,int b) {
		return a*b;
	}
	int divide(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		
		CalculatorProgram t= new CalculatorProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method Started");
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
			
		System.out.println("Addition:"+t.add(a, b));
		System.out.println("Subtract:"+t.subtract(a, b));
		System.out.println("Multiplication:"+t.multiply(a, b));
	    System.out.println("Divide:"+t.divide(a, b));
		System.out.println("Main Method ended");
	
		
		
	}
	

}
