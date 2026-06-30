package Day6;

import java.util.Scanner;

public class PassDistinction {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        if(mark >= 35) {

            System.out.println("Pass");

            if(mark >= 75) {
                System.out.println("Distinction");
            }

        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
    
}
