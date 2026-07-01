package Day10;
/* Notification System using Interface */
interface Notification {
    void send();
}

class Email implements Notification {
    public void send() {
        System.out.println("Email Notification Sent");
    }
}

class SMS implements Notification {
    public void send() {
        System.out.println("SMS Notification Sent");
    }
}

class Push implements Notification {
    public void send() {
        System.out.println("Push Notification Sent");
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Notification n1 = new Email();
        Notification n2 = new SMS();
        Notification n3 = new Push();

        n1.send();
        n2.send();
        n3.send();
    }
}
