package EnhancedJavaClassesAndObjects;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library1 = new Library("Central Library");
        Library library2 = new Library("City Library");

        Bookk book1 = new Bookk("1984", "George Orwell");
        Bookk book2 = new Bookk("To Kill a Mockingbird", "Harper Lee");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(new Bookk("The Catcher in the Rye", "J.D. Salinger"));

        library1.displayBooks();
        library2.displayBooks();
    }
}
