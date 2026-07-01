package Day9;
/*Store Different Vehicle Objects in Parent Reference Array */

class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v[] = {
            new Car(),
            new Bike()
        };

        for (Vehicle x : v) {
            x.start();
        }
    }
}
