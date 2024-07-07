/*
 * #51 - Java PriorityQueue Class with Examples
The PriorityQueue class provides the functionality of
the heap data structure.
Unlike normal queues, priority queue elements are
retrieved in sorted order.

Suppose, we want to retrieve elements in the
ascending order. In this case, the head of the
priority queue will be the smallest element. Once
this element is retrieved, the next smallest element
will be the head of the queue.

 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class Ex_51 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);

        System.out.println("priority queue content:" + pq);
        System.out.println("head of queue :" + pq.peek());
        System.out.println("priority queue content:" + pq);
        System.out.println("head remved :" + pq.poll());
        System.out.println("priority queue content:" + pq);

        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(pq.poll() + " ");
        }
    }
}