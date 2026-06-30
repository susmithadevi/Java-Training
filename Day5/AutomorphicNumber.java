public class AutomorphicNumber {
     public static void main(String[] args) {

        int n = 25;
        int square = n * n;

        if (square % 100 == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
    
}
