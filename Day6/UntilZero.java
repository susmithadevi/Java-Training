package Day6;

import java.util.Scanner;

public class UntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {

            System.out.print("Enter a number (0 to stop): ");
            n = sc.nextInt();

            System.out.println("You entered: " + n);

        } while(n != 0);
        sc.close();
    }
    
}
