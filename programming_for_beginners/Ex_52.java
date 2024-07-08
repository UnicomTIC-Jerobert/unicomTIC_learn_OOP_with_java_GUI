/*
 * #52 - Java Deque Interface with Examples
The Deque interface of the Java collections framework
provides the functionality of a double-ended queue.
It extends the Queue interface.

In a deque, we can insert and remove elements from
both front and rear.

Classes that implement Deque
In order to use the functionalities of the Deque
interface, we need to use classes that implement it:
- ArrayDeque
- LinkedList

Methods :
addFirst()
addLast()
offerFirst()
offerLast()
getFirst()
getLast()
peekFirst()
peekLast()
removeFirst()
removeLast()
pollFirst()
pollLast()
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex_52 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(3);
        dq.addLast(4);
        dq.addFirst(2);
        dq.offerFirst(1);
        dq.addFirst(10);
        dq.add(20);

        System.out.println("deque content :" + dq);
        System.out.println("first element removed : " + dq.pollFirst());
        System.out.println("deque content : " + dq);
        System.out.println("last element removed : " + dq.pollLast());
        System.out.println("deque content : " + dq);
    }
}
