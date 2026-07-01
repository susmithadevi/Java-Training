package Day9;
/*Online Shopping System (Polymorphism) */
class Payment {

    void makePayment() {
        System.out.println("Payment Processing...");
    }
}

class CreditCard extends Payment {

    void makePayment() {
        System.out.println("Payment through Credit Card");
    }
}

class UPI extends Payment {

    void makePayment() {
        System.out.println("Payment through UPI");
    }
}

class CashOnDelivery extends Payment {

    void makePayment() {
        System.out.println("Cash on Delivery Selected");
    }
}

public class ShoppingApp {

    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.makePayment();

        p = new UPI();
        p.makePayment();

        p = new CashOnDelivery();
        p.makePayment();
    }
}
