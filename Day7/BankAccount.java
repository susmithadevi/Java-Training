package Day7;

public class BankAccount {
     int balance = 5000;

    void deposit(int amount) {

        balance += amount;

        System.out.println("Balance = " + balance);

    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.deposit(2000);

    }
    
}
