package OOPS;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        // List of products
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "Jacket", 2000));
        products.add(new Groceries(103, "Apples", 100));

        // Displaying final price for each product
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                System.out.println("Tax Details: " + taxable.getTaxDetails());
                double tax = taxable.calculateTax();
                System.out.println("Final Price: " + product.calculateFinalPrice(tax));
            } else {
                System.out.println("Final Price (No Tax): " + product.calculateFinalPrice(0));
            }
            System.out.println();
        }
    }
}
