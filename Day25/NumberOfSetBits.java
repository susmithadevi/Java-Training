package Day25;

import java.util.Scanner;

public class NumberOfSetBits {

    public static int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            count += n & 1; // Check last bit
            n = n >> 1;     // Right shift
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(hammingWeight(n));

        sc.close();
    }
}
