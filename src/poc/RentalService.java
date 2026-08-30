package poc;

public interface RentalService {

    public abstract boolean checkAvailability();

    public abstract double calculateRent();

    public abstract void displayDetails();

    public abstract void bookVehicle();

    public abstract void returnVehicle();
}