/*Java Assignment – Primitive Data Types
Question:

1.Write a Java program to store the following employee details in appropriate variables:

Employee ID
Employee Grade
Employee Salary
Permanent Employee Status
Employee Experience (in years)
Working Days
Phone Number
Bonus Amount

Print all the employee details in a clear and readable format.*/
package com.vcubelab_dailytest;

public class Javadattypes {

	int eid;
	double esal;
	float eexper;
	int working;
	long phone;
	float bonus;
	char egrade;
	boolean status;
	public static void main(String[] args) {
          Javadattypes t=new Javadattypes();
          
          t.eid=101;
          t.esal=70000;
          t.eexper=2.5f;
          t.working=340;
          t.phone=9567546745L;
          t.bonus=0.2f;
          t.egrade='A';
          t.status=true;
          
          
          
          System.out.println("Employee ID                   :"  +t.eid);
          System.out.println("Employee Grade                :"+t.egrade);
          System.out.println("Employee Salary               :"+t.esal);
          System.out.println("Permanent Employee Status     :"+t.status);
          System.out.println("Employee Experience (in years):"+t.eexper);
          System.out.println("Working Days                  :"+t.working);
          System.out.println("Phone Number                  :"+t.phone);
          System.out.println("Bonus Amount                  :"+t.bonus);
          System.out.println("--------------------------------");

	}

}
