package Day8;

public class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car c = new Car("BMW");
        c.display();
    }
    
}
