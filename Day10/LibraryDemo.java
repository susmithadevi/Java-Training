package Day10;
/* Library Management System using Encapsulation */

class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages) {
        if (pages > 0)
            this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("Java Programming");
        b.setPages(500);

        System.out.println("Book: " + b.getTitle());
        System.out.println("Pages: " + b.getPages());
    }
}
