package Day9;
/*Library Management System (Inheritance + Composition) */

class Book {

    String bookName;

    Book(String bookName) {
        this.bookName = bookName;
    }
}

class Library {

    Book book;

    Library(Book book) {
        this.book = book;
    }

    void display() {
        System.out.println("Book Available : " + book.bookName);
    }
}

class DigitalLibrary extends Library {

    DigitalLibrary(Book book) {
        super(book);
    }

    void readOnline() {
        System.out.println("Reading Book Online");
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Book b = new Book("Java Programming");

        DigitalLibrary d = new DigitalLibrary(b);

        d.display();
        d.readOnline();
    }
}
