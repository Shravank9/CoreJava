package com.vcubelab_dailytest;



public class Student3 {

    int sid;
    String Name;
    String course;

    Student3() {
    	System.out.println("No Arg constructor is called");
        this(0);
    }

    Student3(int sid) {
    	System.out.println("one constructor is called");
        this(sid, "Null");
    }

    Student3(int sid, String Name) {
    	System.out.println("two constructor is called");
        this(sid, Name, "Null");
    }

    Student3(int sid, String Name, String course) {
    	System.out.println("Three constructor is called");
        this.sid = sid;
        this.Name = Name;
        this.course = course;

    }

    void display() {
        System.out.println("________________________________________");
        System.out.println("ID of the Student: " + sid);
        System.out.println("Name of the Student: " + Name);
        System.out.println("Course of the Student: " + course);
        System.out.println("________________________________________");
    }

    public static void main(String[] args) {

    	System.out.println("Main method started"); 

    	Student3 t= new Student3(3, "Su", "JFS");
    	t.display(); 
    	Student3 t1= new Student3(2, "Sura" );
    	t1.display();
    	Student3 t3= new Student3(1);
    	t3.display();
    	Student3 t4= new Student3( );
    	t4.display();
    	System.out.println("Main Methode ended");
    }
}