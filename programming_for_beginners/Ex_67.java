/*
#67 - Java TreeSet Class with Examples
The TreeSet class of the Java collections framework
provides the functionality of a tree data structure.

TreeSet<Integer> numbers = new TreeSet<>();

Methods of TreeSet:I
- Insert Elements to TreeSet
- Access TreeSet Elements
- Remove Elements from TreeSet

TreeSet Vs. HashSet
- Unlike HashSet, elements in TreeSet are stored in
some order.
- TreeSet provides some methods for easy navigation.
For example, first(), last(), headSet(), tailSet(),
etc.
- HashSet is faster than the TreeSet for basic
operations like add, remove, contains and size.
*/

import java.util.Iterator;
import java.util.TreeSet;

public class Ex_67 {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(4);
        tset.add(2);
        tset.add(1);
        tset.add(3);
        tset.add(5);

        System.out.println("treeset content is : " + tset);

        System.out.print("treeset content is : ");
        Iterator<Integer> it = tset.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("first element is : " + tset.first());
        System.out.println("last element is : " + tset.last());
    }
}
