package Day14;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(40);
        q.add(20);
        q.add(10);
        q.add(30);

        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q);
    }
}
