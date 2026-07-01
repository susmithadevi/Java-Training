package Day10;
/*Abstract Vehicle Class with Bike */

abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
