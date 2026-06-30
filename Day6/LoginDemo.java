package Day6;

import java.util.Scanner;

public class LoginDemo {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter Username: ");
        String u = sc.next();

        System.out.print("Enter Password: ");
        String p = sc.next();

        if(u.equals(username)) {

            if(p.equals(password)) {
                System.out.println("Login Success");
            }
            else {
                System.out.println("Wrong Password");
            }

        }
        else {
            System.out.println("Invalid Username");
        }
        sc.close();
    }
    
}
