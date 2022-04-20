package CollectionEx;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        System.out.println(queue.poll());
        queue.add("gayatri");
        queue.add("snehal");
        queue.add("jagruti");
        queue.add("Vishu");

        for (String s :queue) {
            System.out.println(s);
        }

    }
}
