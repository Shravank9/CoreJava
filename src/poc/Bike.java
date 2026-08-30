package poc;

public class Bike extends Vehicle {

	String bikeType;

	boolean hasHelmet;

	Bike(int vehicleNumber, String brand, String model, double rentPerDay, String bikeType) {

		super(vehicleNumber, brand, model, rentPerDay);

		this.bikeType = bikeType;
	}

	Bike(int vehicleNumber, String brand, String model, double rentPerDay, String bikeType, boolean hasHelmet) {

		super(vehicleNumber, brand, model, rentPerDay);

		this.bikeType = bikeType;
		this.hasHelmet = hasHelmet;

	}
//own method
	boolean checkHelmetAvailability() {

		System.out.println("Do you need a helmet?");
		hasHelmet = sc.nextBoolean();

		return hasHelmet;
	}

	@Override
	public void displayDetails() {

		super.displayDetails();

		System.out.println("Bike Type: " + bikeType);
	}

	@Override
	public double calculateRent() {

		System.out.println("Enter the number of days you want to book it!");
		int numberOfDays = sc.nextInt();
		
		

		if (hasHelmet) {

			double HelmetCharge = 500;
			System.out.println("service Charge for Helmet :" + HelmetCharge);

			double Totalrent = HelmetCharge + (rentPerDay * numberOfDays * requiredVehicles);
			
			return Totalrent;
		} else {

			double Totalrent = (rentPerDay * numberOfDays * requiredVehicles);
			return Totalrent;
			

		}

	}

	public static void main(String[] args) {

		System.out.println("Select the Bike:");

		System.out.println("1. Yamaha R15");

		System.out.println("2. Honda Activa");

		System.out.println("3. Royal Enfield Classic 350");

		System.out.println("4. KTM Duke 390");

		System.out.println("5. TVS Apache RTR");

		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		Bike SelectedBike = null;

		switch (choice) {

		case 1 -> SelectedBike = new Bike(201, "Yamaha", "R15", 1500.0, "Sports");

		case 2 -> SelectedBike = new Bike(202, "Honda", "Activa", 800.0, "Scooter");

		case 3 -> SelectedBike = new Bike(203, "Royal Enfield", "Classic 350", 2000.0, "Cruiser");

		case 4 -> SelectedBike = new Bike(204, "KTM", "Duke 390", 2500.0, "Sports");

		case 5 -> SelectedBike = new Bike(205, "TVS", "Apache RTR", 1200.0, "Sports");

		default -> System.out.println("Invalid choice!");

		}

		if (SelectedBike != null) {

			SelectedBike.displayDetails();

			if (SelectedBike.checkAvailability()) {

				if (SelectedBike.checkHelmetAvailability()) {
					System.out.println("Helmet will be provided.");
				} else {
					System.out.println("No helmet required.");
				}

				double totalRent = SelectedBike.calculateRent();

				System.out.println("Total Rent: " + totalRent);
				SelectedBike.bookVehicle();

			} else {

				System.out.println("Booking cannot be completed.");
			}
		}

	}

}
