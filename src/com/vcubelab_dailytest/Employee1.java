package com.vcubelab_dailytest;

public class Employee1 {

	//static variables
	static String cname;
	static String location;
	
	//static block
	static {
		cname="AMD";
		location="Hyderabad";
	}
	
	//instance block
	/*
	 * { System.out.println("Instance Block Excuted");
	 * System.out.println("----------------------------"); }
	 */
	
	
	//instance variable
	int salary;
	String ename;
	
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.salary=100000;
		e1.ename="Ravi";
		e1.method();
		
		Employee1 e2=new Employee1();
		e2.salary=250000;
		e2.ename="Rihan";
		e2.method();
		
	
	}
	void method() {
		System.out.println("CompanyName:"+Employee1.cname);
		System.out.println("location:"+Employee1.location);
		System.out.println("Salary:"+salary);
		System.out.println("EmployeeName:"+ename);
		System.out.println("----------------------------");
	}

}
