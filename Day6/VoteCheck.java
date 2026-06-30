package Day6;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println(result);
        sc.close();
    }
    
}
