package Day2;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value:");
        int a = sc.nextInt();
        System.out.print("Enter b value:");
        int b = sc.nextInt();
        System.out.println("Addition= "+(a+b));
        System.out.println("Subtraction= "+(a-b));
        System.out.println("Multiplication= "+(a*b));
        System.out.println("Division= "+(a/b));
        sc.close();

        
    }
    
    
}
