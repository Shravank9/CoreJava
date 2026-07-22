package com.vcubelab_dailytest;
import java.util.Scanner;

public class Salaryslip {
	Scanner sc=new Scanner(System.in);
	
	void salaryslip(String empname,double basicsalary) {
		
		double hra =0.2*basicsalary;
		double da=0.1*basicsalary;
		double gross=hra+da+basicsalary;
		System.out.println("HRA(20%):"+hra);
		System.out.println("DA1(10%):"+da);
		System.out.println("Gross Salary:"+gross);
	}

	public static void main(String[] args) {
		Salaryslip t=new Salaryslip();
		System.out.println("Enter Employee Name:");
		String a=t.sc.nextLine();
		System.out.println("Enter Basic Salary:");
		double b=t.sc.nextDouble();
		
		t.salaryslip(a,b);
	
		

	}

}
