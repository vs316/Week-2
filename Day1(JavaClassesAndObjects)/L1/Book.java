package JavaClassAndObjects;

public class Book {
    String title;
    String author;
    double price;

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "To Kill a Mockingbird";
        book.author = "Harper Lee";
        book.price = 399.50; // Example price
        book.displayBookDetails();
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}