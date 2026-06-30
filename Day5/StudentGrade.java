public class StudentGrade {
    public static void main(String[] args) {

        int tamil = 85;
        int english = 90;
        int maths = 95;

        int total = tamil + english + maths;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        if (average >= 90)
            System.out.println("Grade A");
        else if (average >= 80)
            System.out.println("Grade B");
        else if (average >= 70)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
    
}
