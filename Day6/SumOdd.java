package Day6;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 1, sum = 0;

        while(i <= n) {

            if(i % 2 != 0) {
                sum += i;
            }

            i++;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
    
    
}
