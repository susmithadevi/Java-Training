package Day7;

public class Product {
     String name = "Laptop";
    int price = 50000;

    void display() {

        System.out.println(name);
        System.out.println(price);

    }

    public static void main(String[] args) {

        Product p = new Product();

        p.display();

    }
    
}
