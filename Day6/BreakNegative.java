package Day6;

import java.util.Scanner;

public class BreakNegative {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if(n < 0) {
                break;
            }

            System.out.println("Number = " + n);
        }

        System.out.println("Loop Ended");
        sc.close();
    }
    
}
