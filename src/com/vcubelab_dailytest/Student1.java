
package com.vcubelab_dailytest;

public class Student1 {

    int sid;
    String Name;
    String course;

    Student1() {
    	System.out.println("No Arg constructor is called");
        this(0);
    }

    Student1(int sid) {
    	System.out.println("one constructor is called");
        this(sid, "Null");
    }

    Student1(int sid, String Name) {
    	System.out.println("two constructor is called");
        this(sid, Name, "Null");
    }

    Student1(int sid, String Name, String course) {
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
    	Student1 t = new Student1();
    	t.display();
    	Student1 t1 = new Student1(1);
    	t1.display(); 
    	Student1 t2 = new Student1(2, "Sura"); 
    	t2.display(); 
    	Student1 t3 = new Student1(3, "Su", "JFS");
    	t3.display(); 
    	System.out.println("Main Methode ended");
    }
}

/*
 * package com.vcubelab_dailytest;
 * 
 * 
 * public class Student1 {
 * 
 * int sid; String name; String course;
 * 
 * // No-argument constructor Student1() { this(0);
 * System.out.println("No-Argument Constructor"); }
 * 
 * // One-argument constructor Student1(int sid) { this(sid, "Not Assigned");
 * System.out.println("One-Argument Constructor"); }
 * 
 * // Two-argument constructor Student1(int sid, String name) { this(sid, name,
 * "Not Assigned"); System.out.println("Two-Argument Constructor"); }
 * 
 * // Three-argument constructor (Final Constructor) Student1(int sid, String
 * name, String course) { System.out.println("Three-Argument Constructor");
 * 
 * this.sid = sid; this.name = name; this.course = course;
 * 
 * // Display details in final constructor display(); }
 * 
 * void display() { System.out.println("----------------------------");
 * System.out.println("Student ID   : " + sid);
 * System.out.println("Student Name : " + name);
 * System.out.println("Course       : " + course);
 * System.out.println("----------------------------"); }
 * 
 * public static void main(String[] args) {
 * 
 * System.out.println("Main Method Started\n");
 * 
 * new Student1();
 * 
 * new Student1(101);
 * 
 * new Student1(102, "Vamshi");
 * 
 * new Student1(103, "Sura", "Java Full Stack");
 * 
 * System.out.println("\nMain Method Ended"); } }
 */