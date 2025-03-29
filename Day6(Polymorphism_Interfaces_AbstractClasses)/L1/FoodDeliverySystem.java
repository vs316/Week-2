package OOPS;

import java.util.ArrayList;
import java.util.List;

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Curry", 350, 1));

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
                System.out.println("Discount Applied: " + discountable.applyDiscount());
            }
            System.out.println();
        }
    }
}
