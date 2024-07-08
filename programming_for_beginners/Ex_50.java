/*
 * #50 - Java Queue Interface with Examples
The Queue interface of the Java collections framework
provides the functionality of the queue data
structure.

Classes that Implement Queue
1. ArrayDeque
2. LinkedList
3. PriorityQueue

(throws exception if empty)

Methods :
add() - Inserts the specified element into the queue
offer() - Inserts the specified element into the queue
element() - Returns the head of the queue (throws exception if empty)
peek() - Returns the head of the queue (returns null if empty)
remove() - Returns and removes the head of the queue (throws exception if empty)
poll() - Returns and removes the head of the queue (returns null if empty)
 */

import java.util.LinkedList;
import java.util.Queue;

public class Ex_50 {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();

        // Inserts element into queue
        queue1.add(1);
        queue1.offer(2);
        queue1.add(3);
        queue1.offer(4);

        System.out.println("queue content is : " + queue1);

        System.out.println("first element is : " + queue1.element());
        System.out.println("first element is : " + queue1.peek());
        System.out.println("first element is : " + queue1.poll());
        System.out.println("queue content is : " + queue1);
        System.out.println("Updated first element is : " + queue1.peek());

        // queue1.clear();
    }
}
