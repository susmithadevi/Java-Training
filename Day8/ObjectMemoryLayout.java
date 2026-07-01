package Day8;

public class ObjectMemoryLayout {
    int x = 100;

    public static void main(String[] args) {

        ObjectMemoryLayout t1 = new ObjectMemoryLayout();
        ObjectMemoryLayout t2 = t1;

        System.out.println(t1.x);
        System.out.println(t2.x);
    }
    
}
