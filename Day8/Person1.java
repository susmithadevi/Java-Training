package Day8;
/* Multilevel Inheritance */
public class Person1 {
    void showPerson1() {
        System.out.println("I am a Person1");
    }
}

class Employee extends Person1 {

    void showEmployee() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {

    void showManager() {
        System.out.println("I am a Manager");
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.showPerson1();
        m.showEmployee();
        m.showManager();
    }
    
}
