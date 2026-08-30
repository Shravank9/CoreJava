package poc;

import java.util.Scanner;

public class Car extends Vehicle {

	String fuelType;
	int numberOfSeats;

	Car(int vehicleNumber, String brand, String model, double rentPerDay, String fuelType, int numberOfSeats) {

		super(vehicleNumber, brand, model, rentPerDay);

		this.fuelType = fuelType;
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Number of Seats: " + numberOfSeats);
	}

	@Override
	public double calculateRent() {

		System.out.println("Enter the number of days you want to book it!");
		int numberOfDays = sc.nextInt();

		double serviceCharge = 500;
		System.out.println("service Charge is:" + serviceCharge);

		double Totalrent = serviceCharge + (rentPerDay * numberOfDays * requiredVehicles);

		return Totalrent;

	}

	public static void main(String[] args) {

		System.out.println("Select the Car:");
		System.out.println("1. BMW M3");
		System.out.println("2. Audi A4");
		System.out.println("3. Toyota Fortuner");
		System.out.println("4. Tesla Model 3");
		System.out.println("5. Hyundai Creta");

		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		Car selectedCar = null;

		switch (choice) {

		case 1 -> selectedCar = new Car(101, "BMW", "M3", 2500.0, "PETROL", 4);

		case 2 -> selectedCar = new Car(102, "Audi", "A4", 3000.0, "PETROL", 5);

		case 3 -> selectedCar = new Car(103, "Toyota", "Fortuner", 4000.0, "DIESEL", 7);

		case 4 -> selectedCar = new Car(104, "Tesla", "Model 3", 5000.0, "ELECTRIC", 5);

		case 5 -> selectedCar = new Car(105, "Hyundai", "Creta", 2200.0, "PETROL", 5);

		default -> System.out.println("Invalid choice!");
		}

		if (selectedCar != null) {

			selectedCar.displayDetails();

			if (selectedCar.checkAvailability()) {

				double totalRent = selectedCar.calculateRent();

				System.out.println("Total Rent: " + totalRent);
				selectedCar.bookVehicle();

			} else {

				System.out.println("Booking cannot be completed.");
			}
		}
		sc.close();

	}
}
