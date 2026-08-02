package constructors;


public class Person {
	
	String name;
	String type;
	int age;
	
	Person(){
		this("Sura");
		System.out.println("No arg constructor is called");
	}
	
	Person(String name){
		this(name,"Male");
		System.out.println("One r constructor is called");
	}
	
	Person(String name,String type){
		this(name,type,20);
		System.out.println("Two r constructor is called");

		
	}
	
	Person(String name,String type,int age){
		System.out.println("Three r constructor is called from parent");
		this.name=name;
		this.type=type;
		this.age=age;

		
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started from person");
		
		System.out.println("Main method ended from person");

	}
	void display() {
        System.out.println("Person Display");
        System.out.println(name);
        System.out.println(type);
        System.out.println(age);
    }
	
	
	

}
class customer extends Person{
	String name="karthik";
	String type="Male";
	int age=23;
	
	customer(String name,String type,int age){
		 super(name, type, age);
		System.out.println("Three construction is called from the customer");
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started from customer");
		
		customer t= new customer("Venu","Female",30);
		t.display1();
		System.out.println("Main method ended from customer ");

	}
	
	void display1() {
		
	        System.out.println("______________________________");
		    System.out.println("Child name : " + this.name);
		    System.out.println("Child type : " + this.type);
		    System.out.println("Child age  : " + this.age);
		    System.out.println("______________________________");

		    System.out.println("Parent name : " + super.name);
		    System.out.println("Parent type : " + super.type);
		    System.out.println("Parent age  : " + super.age);
		    System.out.println("______________________________");
		
	}
	
}
