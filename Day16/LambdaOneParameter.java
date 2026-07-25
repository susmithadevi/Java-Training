package Day16;

interface Square {

    int find(int x);
}

public class LambdaOneParameter {

    public static void main(String[] args) {

        Square s = (x) -> x * x;

        System.out.println(s.find(5));
    }
}
