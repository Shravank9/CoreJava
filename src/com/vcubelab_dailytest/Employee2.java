package com.vcubelab_dailytest;

public class Employee2 {

	 int empid;
	 String empname;
	 double sal;
	 
	 Employee2(){
		
		 
	 }
	 
	 Employee2(int empid, String empname, double sal){
		 this.empid=empid;
		 this.empname=empname;
		 this.sal=sal;
		 
	 }
	 
	 Employee2(Employee2 obj) {
		    this.empid = obj.empid;
		    this.empname = obj.empname;
		    this.sal = obj.sal;
		}
	 
	
	 
	 
	 public static void main(String[] args) {

		    Employee2 t = new Employee2(101, "Krishna", 50000.0);

		    Employee2 t2 = new Employee2(t);

		    t2.incrementSalary(10000);  // Increase salary
		    t2.empname = "Ravi";        // Change name

		    System.out.println("Employee 1");
		    t.display();

		    System.out.println("Employee 2");
		    t2.display();
		    
		    
			
		}
	 
	void incrementSalary(double amount) {
	    sal += amount;
	}
	void display() {
		System.out.println("ID     : " + empid);
	    System.out.println("Name   : " + empname);
	    System.out.println("Salary : " + sal);
		System.out.println("_____________________________________");

		
	}

}





//Java
//1.Create a class Employee with the following requirements:
//Instance variables:
//int empId
//String empName
//double salary
//Create:
//1.A parameterized constructor to initialize the object.
//A copy constructor that copies the data from another Employee object.
//2.Create the following methods:
//display() – Displays employee details.
//incrementSalary(double amount) – Increases the salary by the given amount.
//In the main() method:
//3.Create emp1 using the parameterized constructor.
//.Create emp2 using the copy constructor by copying emp1.
//Increase the salary of emp2 by 10000.
//.Change the name of emp2 to "Ravi".
//.Display both objects.
//4.Verify that changes made to emp2 do not affect emp1.
//
//Expected Output
//Employee 1
//ID     : 101
//Name   : Krishna
//Salary : 50000.0
//
//Employee 2
//ID     : 101
//Name   : Ravi
//Salary : 60000.0
