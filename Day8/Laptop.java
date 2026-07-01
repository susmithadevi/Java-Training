package Day8;

public class Laptop {
    
    String brand;
    int ram;

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16);
        l1.display();
    }
}
    

