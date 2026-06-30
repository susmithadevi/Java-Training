public class SpyNumber {
    public static void main(String[] args) {

        int n = 123;
        int sum = 0, product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
    
}
