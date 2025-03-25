package JavaConstructorsAndAccessModifiers;

// Circle Class
class Circle {
    double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Calling parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}
