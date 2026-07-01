package Day9;
/* Food Delivery System (Inheritance + Composition + Polymorphism) */

class Payment {

    void pay() {
        System.out.println("Payment Done");
    }
}

class UPI extends Payment {

    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Restaurant {

    String name = "Pizza Hut";
}

class Order {

    Restaurant r = new Restaurant();

    void orderFood() {
        System.out.println("Food Ordered From " + r.name);
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        Order o = new Order();
        o.orderFood();

        Payment p = new UPI();
        p.pay();
    }
}
