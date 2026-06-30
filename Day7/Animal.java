package Day7;

public class Animal {
    void sound() {
        System.out.println("Dog Barks");
    }

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.sound();
        a2.sound();

    }
    
}
