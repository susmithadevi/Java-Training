package Day8;
/*Create Three Car Objects */

public class Car1 {
     String brand;
    int price;

    Car1(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " : Rs." + price);
    }

    public static void main(String[] args) {

        Car1 c1 = new Car1("BMW", 5000000);
        Car1 c2 = new Car1("Audi", 6000000);
        Car1 c3 = new Car1("Benz", 7000000);

        c1.display();
        c2.display();
        c3.display();
    }
    
}
