public class StrongNumber {
        public static void main(String[] args) {

        int n = 145, temp = n, sum = 0;

        while (n > 0) {

            int digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }

        if (temp == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }

    
}
