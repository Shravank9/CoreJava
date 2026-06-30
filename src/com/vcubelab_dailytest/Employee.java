/*Java Task:

Instance Block and Static Block

Problem Statement:
1.Create a class named Employee that demonstrates the use of 2 Static Variables, 2 Instance Variables, a Static Block, and an Instance Block.

Requirements:

1.Create a class Employee.
2.Declare 2 static variables:
companyName
location
3.Declare 2 instance variables:
employeeName
salary
4.Use a static block to initialize the static variables.
5.Create two objects of the Employee class.
6.Assign different values to the instance variables using object references.
7.Display the details of both employees.*/
package com.vcubelab_dailytest;

public class Employee {
	static  String companyName;
	static String location;
	
	static {
		companyName="Anthropic";
		location="Hyderabad";
		
	}
	{
	    System.out.println("Instance Block Executed");
		 System.out.println("------------------------------");

	    
	}
	
	int salary;
	String employeeName;
	

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.salary=10000;
		e1.employeeName="Varshith";
		
		 System.out.println("companyName:"+companyName);
		 System.out.println("Location:"+location);
		 System.out.println("EmployeeName:"+e1.employeeName);
		 System.out.println("Salary:"+e1.salary);
		 System.out.println("------------------------------");
		 
		 Employee e2=new Employee();
		 
	    e2.salary=250000;
		e2.employeeName="Ravi";
		
		 System.out.println("companyName:"+companyName);
		 System.out.println("Location:"+location);
		 System.out.println("EmployeeName:"+e2.employeeName);
		 System.out.println("Salary:"+e2.salary);
		 System.out.println("------------------------------");
		 
		 
		

	}

}
