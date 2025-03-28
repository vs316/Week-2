package Inheritance;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(200, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");

        ev.displayInfo();
        ev.charge();
        System.out.println("-----------------");
        pv.displayInfo();
        pv.refuel();
    }
}
