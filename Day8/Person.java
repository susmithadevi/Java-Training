package Day8;

public class Person {
     String name = "Susi";

    void showPerson() {
        System.out.println("Person Name: " + name);
    }
}

class Employee extends Person {
    int salary = 50000;

    void showEmployee() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.showPerson();
        e.showEmployee();
    }
    
}
