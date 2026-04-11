package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
