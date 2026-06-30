package Day6;

import java.util.Scanner;

public class CountDigitsDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        do {
            count++;
            n /= 10;
        } while(n != 0);

        System.out.println("Digits = " + count);
        sc.close();
    }
    
}
