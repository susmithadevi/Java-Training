package Day10;
/* Four Access Modifiers using Two Classes */
class Parent {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Child extends Parent {
    void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
