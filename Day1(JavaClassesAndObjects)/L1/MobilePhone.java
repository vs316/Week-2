package JavaClassAndObjects;

public class MobilePhone {
    String brand;
    String model;
    double price;

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Apple";
        phone.model = "iPhone 14";
        phone.price = 79999.99; // Example price
        phone.displayMobileDetails();
    }

    // Method to display mobile phone details
    public void displayMobileDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
