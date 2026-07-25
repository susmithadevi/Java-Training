package Day14;

import java.util.*;

public class IterateHashMap {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Orange");
        map.put(3,"Mango");

        for(Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
