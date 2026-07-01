package Day8;
class BankAccount{
     int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        this(1001);
        System.out.println("Default Constructor");
    }

    BankAccount(int accountNumber) {
        this(accountNumber, "Unknown");
        System.out.println("One Parameter Constructor");
    }

    BankAccount(int accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
        System.out.println("Two Parameter Constructor");
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        System.out.println("Full Constructor");
    }

    void display() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.display();
    }
}