package OOPS;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        // Adding items to the library
        items.add(new Book(1, "1984", "George Orwell"));
        items.add(new Magazine(2, "National Geographic", "Various"));
        items.add(new DVD(3, "The Matrix", "Wachowski"));

        // Displaying and processing library items
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
                if (reservable.checkAvailability()) {
                    reservable.reserveItem();
                }
            }
            System.out.println();
        }
    }
}
