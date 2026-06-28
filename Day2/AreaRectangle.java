package Day2;
import java.util.Scanner;
public class AreaRectangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        int l = sc.nextInt();
        System.out.print("Enter the Breadth:");
        int b = sc.nextInt();

        int area = l * b;

        System.out.println("Area = " + area);
        sc.close();
    }
    

}
