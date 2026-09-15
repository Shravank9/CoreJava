package com.vcubelab_dailytest.oopstask8_15_09_26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="";
		
		do {
		System.out.println("Which one do you wnat to select?");
		System.out.println("1)Circle\n2)Recatngle\n3)Triangle\n4)Exit");
		
		System.out.println("Enter the choice ");
		int choice =sc.nextInt();
		
		Shape s=null;
		
		switch(choice) {
		case 1->{
			s=new Circle();
			s.area();
		}
		case 2->{
			s=new Rectangle();
			s.area();
		}
		case 3->{
			s=new Triangle();
			s.area();
		}
		case 4->{
			System.out.println("Exited");
			
		}
		default->{
			System.out.println("Invalid choice");
		}
		
		}
		System.out.println("Do u want to continue(Y/N)?");
		a=sc.next();
		
		}while(a.equalsIgnoreCase("y"));

		
		sc.close();
	}

}
