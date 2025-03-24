package JavaClassAndObjects;

public class Circle {
    double radius;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5; // Example radius
        circle.displayDetails();
    }

    // Method to calculate the area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}
