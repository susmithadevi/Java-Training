package Day7;

public class VariableDemo {
    int x = 100;

    void display() {

        int y = 50;

        System.out.println("Instance Variable = " + x);
        System.out.println("Local Variable = " + y);

    }

    public static void main(String[] args) {

        VariableDemo v = new VariableDemo();

        v.display();

    }
    
}
