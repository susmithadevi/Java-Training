package Day7;

public class Calculator {
    void add(int a, int b) {
        System.out.println("Add = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Sub = " + (a - b));
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(20, 10);
        c.sub(20, 10);

    }
    
}
