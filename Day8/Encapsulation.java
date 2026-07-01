package Day8;



public class Encapsulation {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Encapsulation s = new Encapsulation();

        s.setAge(20);

        System.out.println(s.getAge());
    }
    
}
