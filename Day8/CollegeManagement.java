package Day8;

class CollegePerson {

    String name;
    int age;

    CollegePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class CollegeStudent extends CollegePerson {

    int rollNo;

    CollegeStudent(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No : " + rollNo);
    }
}

class Teacher extends CollegePerson {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacher() {
        displayPerson();
        System.out.println("Subject : " + subject);
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        CollegeStudent s =
            new CollegeStudent("Susi", 20, 101);

        Teacher t =
            new Teacher("Kumar", 40, "Java");

        System.out.println("Student Details");
        s.displayStudent();

        System.out.println();

        System.out.println("Teacher Details");
        t.displayTeacher();
    }
}