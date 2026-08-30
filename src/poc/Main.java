package poc;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== VEHICLE RENTAL SYSTEM =====");

        System.out.println("1. Rent Vehicle");
        System.out.println("2. Return Vehicle");

        System.out.println("Enter your choice:");

        int serviceChoice = Vehicle.sc.nextInt();

        switch (serviceChoice) {

        case 1 -> rentVehicle();

        case 2 -> returnVehicle();

        default -> System.out.println("Invalid choice!");
        }

        Vehicle.sc.close();
    }

    static void rentVehicle() {

        System.out.println("Select Vehicle Type:");

        System.out.println("1. Car");
        System.out.println("2. Bike");

        System.out.println("Enter your choice:");

        int vehicleChoice = Vehicle.sc.nextInt();

        switch (vehicleChoice) {

        case 1 -> rentCar();

        case 2 -> rentBike();

        default -> System.out.println("Invalid choice!");
        }
    }

    static void returnVehicle() {

        System.out.println("Select Vehicle Type:");

        System.out.println("1. Car");
        System.out.println("2. Bike");

        System.out.println("Enter your choice:");

        int vehicleChoice = Vehicle.sc.nextInt();

        switch (vehicleChoice) {

        case 1 -> {

            Car car =
                    new Car(101, "BMW", "M3",
                            2500.0, "PETROL", 4);

            car.returnVehicle();
        }

        case 2 -> {

            Bike bike =
                    new Bike(201, "Yamaha", "R15",
                            1500.0, "Sports");

            bike.returnVehicle();
        }

        default -> System.out.println("Invalid choice!");
        }
    }

    static void rentCar() {

        System.out.println("Select the Car:");

        System.out.println("1. BMW M3");
        System.out.println("2. Audi A4");
        System.out.println("3. Toyota Fortuner");
        System.out.println("4. Tesla Model 3");
        System.out.println("5. Hyundai Creta");

        System.out.println("Enter your choice:");

        int choice = Vehicle.sc.nextInt();

        Car selectedCar = null;

        switch (choice) {

        case 1 -> selectedCar =
                new Car(101, "BMW", "M3",
                        2500.0, "PETROL", 4);

        case 2 -> selectedCar =
                new Car(102, "Audi", "A4",
                        3000.0, "PETROL", 5);

        case 3 -> selectedCar =
                new Car(103, "Toyota", "Fortuner",
                        4000.0, "DIESEL", 7);

        case 4 -> selectedCar =
                new Car(104, "Tesla", "Model 3",
                        5000.0, "ELECTRIC", 5);

        case 5 -> selectedCar =
                new Car(105, "Hyundai", "Creta",
                        2200.0, "PETROL", 5);

        default -> System.out.println("Invalid choice!");
        }

        if (selectedCar != null) {

            selectedCar.displayDetails();

            if (selectedCar.checkAvailability()) {

                double totalRent =
                        selectedCar.calculateRent();

                System.out.println("Total Rent: " + totalRent);

                selectedCar.bookVehicle();

            } else {

                System.out.println("Booking cannot be completed.");
            }
        }
    }

    static void rentBike() {

        System.out.println("Select the Bike:");

        System.out.println("1. Yamaha R15");
        System.out.println("2. Honda Activa");
        System.out.println("3. Royal Enfield Classic 350");
        System.out.println("4. KTM Duke 390");
        System.out.println("5. TVS Apache RTR");

        System.out.println("Enter your choice:");

        int choice = Vehicle.sc.nextInt();

        Bike selectedBike = null;

        switch (choice) {

        case 1 -> selectedBike =
                new Bike(201, "Yamaha", "R15",
                        1500.0, "Sports");

        case 2 -> selectedBike =
                new Bike(202, "Honda", "Activa",
                        800.0, "Scooter");

        case 3 -> selectedBike =
                new Bike(203, "Royal Enfield",
                        "Classic 350",
                        2000.0, "Cruiser");

        case 4 -> selectedBike =
                new Bike(204, "KTM", "Duke 390",
                        2500.0, "Sports");

        case 5 -> selectedBike =
                new Bike(205, "TVS", "Apache RTR",
                        1200.0, "Sports");

        default -> System.out.println("Invalid choice!");
        }

        if (selectedBike != null) {

            selectedBike.displayDetails();

            if (selectedBike.checkAvailability()) {

                if (selectedBike.checkHelmetAvailability()) {

                    System.out.println("Helmet will be provided.");

                } else {

                    System.out.println("No helmet required.");
                }

                double totalRent =
                        selectedBike.calculateRent();

                System.out.println("Total Rent: " + totalRent);

                selectedBike.bookVehicle();

            } else {

                System.out.println("Booking cannot be completed.");
            }
        }
    }
}