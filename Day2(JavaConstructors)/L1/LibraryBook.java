package JavaConstructorsAndAccessModifiers;

// Library Book System
class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Borrow Method
    public boolean borrow() {
        if (availability) {
            availability = false;
            return true;
        } else {
            return false;
        }
    }
}
