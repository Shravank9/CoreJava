/*Today Task
Java
Vehicle Registration
1.Write a Java program to create a method vehicleDetails() with no arguments and no return type. Inside the method, use Scanner to accept:
Vehicle Number 
Owner Name 
Vehicle Type 
Mileage 
Electric Vehicle
1.Display all the vehicle details.
2.No Return Type + No Arguments methods
3.Object creation and method calling from main().*/

package com.vcubelab_dailytest;
import java.util.Scanner;

public class VechicleProgram {
	
 String vehicle_number;
 String ownername;
 String vehicle_type;
 float mileage;
 boolean elctric_vehicle;
 
 
 void vehicledetails() {
	 
	 
	 
	 Scanner t=new Scanner(System.in);
	 System.out.print("Enter Vehicle Number: ");
	 vehicle_number = t.nextLine();

	 System.out.print("Enter Owner Name: ");
	 ownername = t.nextLine();

	 System.out.print("Enter Vehicle Type: ");
	 vehicle_type = t.nextLine();

	 System.out.print("Enter Mileage: ");
	 mileage = t.nextFloat();

	 System.out.print("Electric Vehicle (true/false): ");
	 elctric_vehicle = t.nextBoolean();
	 System.out.println("Vehicle Numbe:"+vehicle_number);
	 System.out.println("Owner Name"+ownername);
	 System.out.println("Vehicle Type "+vehicle_type);
	 System.out.println("Mileage: "+mileage);
	 System.out.println("Electric Vehicle:"+elctric_vehicle);
	 System.out.println("--------------------------------------------");

 }
 
 
 
	public static void main(String[] args) {
		
		VechicleProgram t1=new VechicleProgram();
		
		t1.vehicledetails();
		

	}

}
