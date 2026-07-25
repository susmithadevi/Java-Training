public class Finally {

    public static void main(String[] args) {

        try {

            String s = null;

            System.out.println(s.length());

        } catch (NullPointerException e) {

            System.out.println("Null Object");

        } finally {

            System.out.println("Finally Block Executed");
        }
    }
}