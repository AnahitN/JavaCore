package chapter14.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(17);

        System.out.println("poll" + pQueue.poll());
        System.out.println("peek" + pQueue.peek());
        System.out.println(pQueue);
        


    }

}
