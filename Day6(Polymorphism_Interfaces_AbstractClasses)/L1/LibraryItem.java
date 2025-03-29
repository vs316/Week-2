package OOPS;

// Interface Reservable
interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    // Constructor
    protected LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for books
    }

    @Override
    public void reserveItem() {
        isAvailable = false;
        System.out.println("Book reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration for magazines
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days loan duration for DVDs
    }

    @Override
    public void reserveItem() {
        isAvailable = false;
        System.out.println("DVD reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
