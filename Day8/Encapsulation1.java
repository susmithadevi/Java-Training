package Day8;



public class Encapsulation1 {
     private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Encapsulation1 s = new Encapsulation1();

        s.setName("Susi");
        s.display();
    }
    
}
