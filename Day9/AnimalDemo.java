package Day9;
/* Override sound() Method in Dog and Cat */

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat Meows");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}