package JavaConstructorsAndAccessModifiers;

// Book Class
class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

