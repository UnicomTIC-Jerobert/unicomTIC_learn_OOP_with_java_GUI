/*
#53 - Java LinkedList with Examples
The LinkedList class of the Java collections
framework provides the functionality of the linked
list data structure (doubly linkedlist).

Each element in a linked list is known as a node. It consists of 3 fields:
Prev - stores an address of the previous element in the list. It is null for the first element
Next - stores an address of the next element in the list. It is null for the last element

Data - stores the actual data

add() : to add elements in LinkedList
get() : to access an element from the LinkedList
set() : to change element at position specified

LinkedList class also implements the Queue and the
Deque interface, so it can implement methods of these
interfaces as well.
*/

import java.util.LinkedList;

public class Ex_53 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Dog");
        l1.add("Cat");
        l1.add("Cow");

        System.out.println("linked list content :" + 11);
        // System.out.println("first index element:"+11.get(1));
        l1.set(2, "Horse");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));

        }
    }
}
