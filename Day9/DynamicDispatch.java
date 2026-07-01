package Day9;
/*Dynamic Method Dispatch */

class Parent {

    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child Method");
    }
}

public class DynamicDispatch {

    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
    }
}
