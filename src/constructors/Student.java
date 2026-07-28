package constructors;

public class Student {

    int id;
    String name;
    String school;
    int section;

 
    

    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor");
    }

    // Copy Constructor (Only ONE is allowed)
    Student(Student s2,String school) {
        this.id = s2.id;
        this.name = s2.name;
        this.school=school;
        System.out.println("Copy Constructor 1");
    }
   // Copy Constructor (Only ONE is allowed)
    Student(Student s2,int section) {
        this.id = s2.id;
        this.name = s2.name;
        this.school=s2.school;
        this.section=section;
        System.out.println("Copy Constructor 2");
    }

    

    public static void main(String[] args) {


        Student s2 = new Student(101, "Vamshi");
        Student s3 = new Student(s2,"Vedanat");
        Student s4 = new Student(s3,1);

        s2.display();
        s3.display();
        s4.display();
       
    }
    void display() {
        System.out.println("_____________________________");
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
         System.out.println("School = " + school);
          System.out.println("section " + section);
     System.out.println("_____________________________");
    }}
