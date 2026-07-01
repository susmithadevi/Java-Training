package Day9;
/* Store Multiple Animal Objects in Array*/

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

public class AnimalArray {

    public static void main(String[] args) {

        Animal a[] = {
            new Dog(),
            new Cat()
        };

        for (Animal x : a) {
            x.sound();
        }
    }
}
