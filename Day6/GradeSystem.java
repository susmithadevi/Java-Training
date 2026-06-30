package Day6;

import java.util.Scanner;

public class GradeSystem {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        String grade =
                (mark >= 90) ? "A" :
                (mark >= 80) ? "B" :
                (mark >= 70) ? "C" :
                (mark >= 35) ? "D" : "Fail";

        System.out.println("Grade = " + grade);
        sc.close();
    }
    
}
