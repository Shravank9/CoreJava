
//Java
//1.Product Billing
//Create a class Product with overloaded 2.constructors:
//Product()
//Product( productName)
//Product( productName,  price)
//Product( productName,  price,  quantity)
//Requirement:
//3.Use constructor chaining.
//In the final constructor, calculate and display the Total Cost.
//
//Sample Input
//Enter Product Name: Laptop
//Enter Price: 55000
//Enter Quantity: 2
//
//Expected Output
//Product Name : Laptop
//Price        : 55000.0
//Quantity     : 2
//Total Cost   : 110000.0

package constructors;
import java.util.Scanner;

public class Productbill {
	

	String name;
    double price;
    int quantity;
    double totalcost;
    
    Productbill(){
    	System.out.println("No arg constructor is called");
    	this("Not Assigned");
    }
    Productbill(String name){
    	System.out.println("One constructor is called");
    	this(name,0);

    	
    }
    Productbill(String name,double price){
    	System.out.println("two constructor is called");
    	this(name,price,0);

    	
    }
    Productbill(String name,double price,int quantity){
    	System.out.println("Three constructor is called");
    	this.name=name;
    	this.price=price;
    	this.quantity=quantity;
    	display();
    	
    }
    
    double calculate(int quantity,double price) {
    	return price*quantity;
    	
    }
    void display() {
    	System.out.println("Product Name     :"+name);
    	System.out.println("Price            :"+price);
    	System.out.println("Quantity         :"+quantity);
    	System.out.println("Total Cost       :"+calculate(quantity, price));
        System.out.println("_____________________________________________________");
    	
    }
    
    
    
    

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);

		
		 System.out.println("Enter the Product Name:");
		 String name=sc.nextLine();
		 System.out.println("Enter Price Of The Product:");
		 double price=sc.nextDouble();
		 System.out.println("Enter the Qunatity of the Product:");
		 int quantity=sc.nextInt();
		 
		 Productbill t= new Productbill(name,price,quantity);
		 
		 
		
		
		
		System.out.println("Main method ended");

	}

}
