package Day9;
/*Payment System (UPI, Card, Cash) - Polymorphism */

class Payment {
    void pay() {
        System.out.println("Payment Processing");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Payment through Card");
    }
}

class Cash extends Payment {
    void pay() {
        System.out.println("Payment through Cash");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();

        p = new Cash();
        p.pay();
    }
}
