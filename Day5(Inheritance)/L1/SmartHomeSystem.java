package Inheritance.SmartHomeDevices;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("Thermo001", "Online", 22.5);
        thermostat.displayStatus();
    }
}
