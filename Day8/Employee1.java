package Day8;
/*Employee Class Illustrating Local, Instance, and Static Variables */

public class Employee1 {
    
    String name = "Susi";

   
    static String company = "ABC Technologies";

    void display() {

        
        int salary = 50000;

        System.out.println("Name    : " + name);
        System.out.println("Company : " + company);
        System.out.println("Salary  : " + salary);
    }

    public static void main(String[] args) {

        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1();

        e1.display();
        e2.display();
    }
    
}
