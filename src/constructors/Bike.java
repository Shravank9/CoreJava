package constructors;



class Vehicle{
	
	String name;
	int price;
	String model;
	
	
	  Vehicle() {
		  this("Unknown","unknown",0);
		  System.out.println("No Arg constructor is called from Vehicle");
	  
	  } 
	  Vehicle(String name,String model,int price) {
	  System.out.println("two constructor is called from vehicle");
	  this.name=name;
	  this.price=price;
	  this.model=model;
	  
	  }
	  void vehcileinfo() {
		  System.out.println("Model of the vehicle:"+model);
		  System.out.println("Brand of the vehicle:"+name);
		  System.out.println("Price of the vehicle:"+price);

	  }
	 
	  
	
	public static void main(String[] args) {
		System.out.println("Main method started");

	}

	
}

public class Bike extends Vehicle {
	
	
	
	Bike(){
		System.out.println("No arg constructor is called from bike");
	}
	Bike(String name,String model,int price){
		super(name,model,price);
	System.out.println("parametrized constructor is called from bike");

		
	}
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Bike t=new Bike("KIA","Sonnet",150000);
		t.vehcileinfo();
		
		
		System.out.println("Main method ended");

	}

	

}
