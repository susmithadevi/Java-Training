package Day10;
/*Student Class using Getters and Setters */

class Student {
    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setRollNo(1);
        s.setName("Susi");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
    }
}
