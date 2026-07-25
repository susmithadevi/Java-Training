package Day16;

interface Animal {

    void sound();
}

public class AnonymousClassDemo {

    public static void main(String[] args) {

        Animal obj = new Animal() {

            public void sound() {

                System.out.println("Dog Barks");
            }
        };

        obj.sound();
    }
}
