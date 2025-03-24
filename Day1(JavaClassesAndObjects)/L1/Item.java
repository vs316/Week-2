package JavaClassAndObjects;

public class Item {
    int itemCode;
    String itemName;
    double price;

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 101; // Example item code
        item.itemName = "Laptop";
        item.price = 75000.00; // Example price

        item.displayItemDetails();
        int quantity = 2; // Example quantity
        System.out.println("Total Cost for " + quantity + " units: " + item.calculateTotalCost(quantity));
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}