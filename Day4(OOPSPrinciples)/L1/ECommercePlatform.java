package ObjectModelingContinued;

// Main class to demonstrate functionality
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create an order and add products
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(product3);

        // Create a customer
        Customer customer = new Customer("John");

        // Place orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display orders and their products
        customer.showOrders();
    }
}