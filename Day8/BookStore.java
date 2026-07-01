package Day8;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : Rs." + price);
        System.out.println();
    }
}

public class BookStore {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling", 650);
        Book b2 = new Book("Python Basics", "Guido van Rossum", 550);
        Book b3 = new Book("Data Structures", "Mark Allen", 700);

        b1.display();
        b2.display();
        b3.display();
    }
    
}
