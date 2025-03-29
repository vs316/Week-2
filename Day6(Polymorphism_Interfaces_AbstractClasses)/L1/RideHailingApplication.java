package OOPS;

import java.util.ArrayList;
import java.util.List;


// Main class
public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(new Cars("CAR001", "John", 15));
        vehicles.add(new Bikes("BIKE002", "Mike", 10));
        vehicles.add(new Auto("AUTO003", "Raj", 8));

        for (Vehicles vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("Downtown");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }
}