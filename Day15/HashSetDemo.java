package Day15;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);

        System.out.println(set.contains("Python"));

        set.remove("Python");

        System.out.println(set);
    }
}
