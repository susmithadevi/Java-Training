package Day16;

interface Add {

    int sum(int a, int b);
}

public class LambdaTwoParameter {

    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        System.out.println(obj.sum(10, 20));
    }
}
