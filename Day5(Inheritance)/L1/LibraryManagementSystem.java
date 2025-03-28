package Inheritance.LibraryManagement;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author("The Java Journey", 2023, "Jane Doe", "An experienced Java developer and writer.");
        bookWithAuthor.displayInfo();
    }
}
