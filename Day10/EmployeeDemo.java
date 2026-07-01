package Day10;
/* Employee Management System using Encapsulation with Validation */

class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary >= 10000)
            this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setId(101);
        e.setName("Susi");
        e.setSalary(25000);

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
