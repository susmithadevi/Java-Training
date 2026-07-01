package Day9;
/* School Management System (Inheritance) */

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name : " + name);
    }
}

class Student extends Person {

    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void showStudent() {
        display();
        System.out.println("Roll No : " + rollNo);
    }
}

class Teacher extends Person {

    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void showTeacher() {
        display();
        System.out.println("Subject : " + subject);
    }
}

public class SchoolManagement {

    public static void main(String[] args) {

        Student s =
            new Student("Susi", 101);

        Teacher t =
            new Teacher("Kumar", "Java");

        s.showStudent();

        System.out.println();

        t.showTeacher();
    }
}
