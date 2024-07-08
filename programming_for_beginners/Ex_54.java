/*
#54 - Java ArrayDeque with Examples
In Java, we can use the ArrayDeque class to implement
queue and deque data structures using arrays.

The ArrayDeque class implements these two interfaces:
- Java Queue Interface
- Java Deque Interface

Methods :
The ArrayDeque class provides implementations for all
the methods present in Oueue and Deque interface.

add()
addFirst()
addLast()
getFirst()
getLast()
peek()
peekFirst()
peekLast()
poll()
pollFirst()
pollLast()

*/

import java.util.ArrayDeque;

public class Ex_54 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(4);
        ad.addFirst(3);
        ad.addFirst(2);
        ad.addLast(5);

        System.out.println("array deque content : " + ad);
        System.out.println("First element : " + ad.getFirst());
        System.out.println("last element : " + ad.getLast());

        System.out.println("remove first element : " + ad.pollFirst());
        System.out.println("remove last element : " + ad.pollLast());
        System.out.println("array deque content : " + ad);
    }
}
