package ObjectModelingContinued;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order class
class Order {
    private List<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " (INR" + product.getPrice() + ")");
        }
    }
}

// Customer class
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " has placed an order.");
    }

    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.showProducts();
        }
    }
}

