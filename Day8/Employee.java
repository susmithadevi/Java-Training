package Day8;

public class Employee {

    Employee() {
        this("Susi");
        System.out.println("Default Constructor");
    }

    Employee(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e);
    }
}