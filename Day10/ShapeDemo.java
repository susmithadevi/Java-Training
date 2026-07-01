package Day10;
/*Abstract Shape Class (Circle & Rectangle) */

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 10, b = 5;
        System.out.println("Rectangle Area = " + (l * b));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
