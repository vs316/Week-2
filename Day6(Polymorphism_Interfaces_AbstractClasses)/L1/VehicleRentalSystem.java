package OOPS;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", "Car", 1000));
        vehicles.add(new Bike("B202", "Bikes", 500));
        vehicles.add(new Truck("T303", "Truck", 2000));

        // Displaying rental and insurance costs for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Details: " + insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            }
            System.out.println();
        }
    }
}