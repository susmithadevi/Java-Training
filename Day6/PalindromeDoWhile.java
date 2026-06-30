package Day6;

import java.util.Scanner;

public class PalindromeDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        do {
            rev = rev * 10 + n % 10;
            n /= 10;
        } while(n != 0);

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
    
}
