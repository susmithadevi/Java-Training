package Day10;
/*Payment Interface using UPI and Card */

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class Card implements Payment {
    public void pay(double amount) {
        System.out.println("Card Payment: " + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();

        p1.pay(500);
        p2.pay(1000);
    }
}
