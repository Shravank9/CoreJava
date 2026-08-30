package poc;

import java.util.Scanner;

public class Vehicle implements RentalService {

	private int vehicleNumber;
	private String brand;
	private String model;
	protected double rentPerDay;
	protected int requiredVehicles;
	private boolean available;
	private int availableVehicles = 10;

	static Scanner sc = new Scanner(System.in);

	@Override
	public boolean checkAvailability() {

		System.out.println("Enter the number of vehicles u want :");
		requiredVehicles = sc.nextInt();

		if (requiredVehicles <= availableVehicles) {
			available = true;
			availableVehicles -= requiredVehicles;
			System.out.println("Vehicles are available!");
		} else {
			available = false;

			System.out.println("Presntly there is no available of vehicles!");

		}

		return available;

	}

	@Override
	public double calculateRent() {

		System.out.println("Enter the number of days you want to book it!");
		int numberOfDays = sc.nextInt();

		double Totalrent = rentPerDay * numberOfDays * requiredVehicles;

		return Totalrent;

	}

	@Override
	public void displayDetails() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Rent Per Day: " + rentPerDay);
		System.out.println("Available Vehicles: " + availableVehicles);
	}

	@Override
	public void bookVehicle() {

		System.out.println("Vehicle booked successfully!");
	}

	@Override
	public void returnVehicle() {

		System.out.println("Vehicle returned successfully!");
	}

	Vehicle(int vehicleNumber, String brand, String model, double rentPerDay) {

		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentPerDay = rentPerDay;
	}

}
