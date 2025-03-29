package OOPS;

// Interface Taxable
interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

// Abstract class Product
abstract class Product {
    private final int productId;
    private final String name;
    private double price;

    // Constructor
    protected Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters for encapsulation
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double calculateFinalPrice(double tax) {
        return getPrice() + tax - calculateDiscount();
    }
}

// Electronics subclass
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate for Electronics: 18%";
    }
}

// Clothing subclass
class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.12;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate for Clothing: 12%";
    }
}

// Groceries subclass
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

