package Day9;
/*Aggregation (Department and Teacher) */

class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {

    String deptName;
    Teacher teacher;

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println(deptName);
        System.out.println(teacher.name);
    }

    public static void main(String[] args) {

        Teacher t = new Teacher("Suresh");

        Department d =
            new Department("CSE", t);

        d.display();
    }
}