package EnhancedJavaClassesAndObjects;

import java.util.ArrayList;

class Bookk {
    String title, author;

    public Bookk(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Bookk> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Bookk book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Bookk book : books) {
            book.displayDetails();
        }
    }
}
