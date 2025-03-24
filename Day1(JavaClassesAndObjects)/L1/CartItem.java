package JavaClassAndObjects;

import java.util.ArrayList;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize a cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();

        // Add items to the cart
        cart.add(new CartItem("Laptop", 50000.00, 1));
        cart.add(new CartItem("Mouse", 500.00, 2));
        cart.add(new CartItem("Keyboard", 1000.00, 1));

        // Display cart items
        double totalCost = 0;
        System.out.println("Shopping Cart:");
        for (CartItem item : cart) {
            System.out.println("Item: " + item.itemName + ", Price: " + item.price + ", Quantity: " + item.quantity + ", Total: " + item.calculateTotal());
            totalCost += item.calculateTotal();
        }

        System.out.println("Total Cost: " + totalCost);
    }

    // Method to calculate the total cost of an item
    public double calculateTotal() {
        return price * quantity;
    }
}
