package Day7;

public class Employee {
     int id = 101;
    String name = "John";

    void display() {

        System.out.println(id);
        System.out.println(name);

    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.display();

    }
    
}
