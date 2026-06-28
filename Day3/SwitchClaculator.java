package Day3;

public class SwitchClaculator {
     public static void main(String[] args) {
        int a = 20, b = 10;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
