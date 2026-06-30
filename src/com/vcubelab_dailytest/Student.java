package com.vcubelab_dailytest;

public class Student {
	
	//it will goes to heap area, when the obkect is created
	int id;
	int age;
	String name;
	String  address;
	
	//it goes to the method area,it automatically loads with class 
	static int clgid;
	static String clgname;
	

	public static void main(String[] args) {
		
		
		Student obj =new Student();
		System.out.println("student id:      "+ obj.id);
		System.out.println("student age:     "+ obj.age);
		System.out.println("student name:    "+ obj.name);
		System.out.println("student address: "+ obj.address);
		System.out.println("student clgid:   "+ Student.clgid);
		System.out.println("student clgname: "+ Student.clgname);
		System.out.println("-------------------------------------");
		
		
		Student obj1 =new Student();
		obj1.id=10;
		obj1.age=20;
		obj1.name="Praveen";
		obj1.address="Kompally";
		clgid=919;
		clgname="CMR";
		
		System.out.println("student id:      "+ obj1.id);
		System.out.println("student age:     "+ obj1.age);
		System.out.println("student name:    "+ obj1.name);
		System.out.println("student address: "+ obj1.address);
		System.out.println("student clgid:   "+ Student.clgid);
		System.out.println("student clgname: "+ Student.clgname);
		System.out.println("-------------------------------------");
		
		Student obj2 =new Student();
		obj2.id=11;
		obj2.age=21;
		obj2.name="Chary";
		obj2.address="Medchal";
		
		System.out.println("student id:      "+ obj2.id);
		System.out.println("student age:     "+ obj2.age);
		System.out.println("student name:    "+ obj2.name);
		System.out.println("student address: "+ obj2.address);
		System.out.println("student clgid:   "+ Student.clgid);
		System.out.println("student clgname: "+ Student.clgname);
		System.out.println("-------------------------------------");
		
		Student obj3 =new Student();
		obj3.id=12;
		obj3.age=22;
		obj3.name="Karthik";
		obj3.address="Gundlapochampally";
		
		System.out.println("student id:      "+ obj3.id);
		System.out.println("student age:     "+ obj3.age);
		System.out.println("student name:    "+ obj3.name);
		System.out.println("student address: "+ obj3.address);
		System.out.println("student clgid:   "+ Student.clgid);
		System.out.println("student clgname: "+ Student.clgname);
		System.out.println("-------------------------------------");
		
		Student obj4 =new Student();
		
		Student.clgid=999;
		obj4.clgname="JNTUH";
		
		System.out.println("student id:      "+ obj4.id);
		System.out.println("student age:     "+ obj4.age);
		System.out.println("student name:    "+ obj4.name);
		System.out.println("student address: "+ obj4.address);
		System.out.println("student clgid:   "+ Student.clgid);
		System.out.println("student clgname: "+ Student.clgname);
		System.out.println("-------------------------------------");
		
		Student obj5 =new Student();
		obj5.id=13;
		obj5.age=23;
		obj5.name="Suresh";
		obj5.address="Maisammmaguda";
		
		System.out.println("student id:      "+ obj5.id);
		System.out.println("student age:     "+ obj5.age);
		System.out.println("student name:    "+ obj5.name);
		System.out.println("student address: "+ obj5.address);
		System.out.println("student clgid:   "+ Student.clgid);
		System.out.println("student clgname: "+ Student.clgname);
		System.out.println("-------------------------------------");
		
		
		
	}

}
