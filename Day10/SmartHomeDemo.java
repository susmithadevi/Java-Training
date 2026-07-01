package Day10;
/* Smart Home System using Interfaces */

interface SmartDevice {
    void turnOn();
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan is ON");
    }
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is ON");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartDevice d1 = new Fan();
        SmartDevice d2 = new Light();

        d1.turnOn();
        d2.turnOn();
    }
}
