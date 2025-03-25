package JavaConstructorsAndAccessModifiers;

// CarRental System
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 100.0; // Assuming a constant daily rate

    // Default Constructor
    public CarRental() {
        customerName = "Unknown";
        carModel = "Unknown";
        rentalDays = 0;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to Calculate Total Cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
