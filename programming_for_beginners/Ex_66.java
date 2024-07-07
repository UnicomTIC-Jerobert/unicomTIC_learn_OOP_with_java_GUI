/*
#66 - Java SortedSet Interface with Examples
The SortedSet interface of the Java Collections
framework is used to store elements with some order in
a set.
It extends the Set interface.

In order to use the functionalities of the SortedSet
interface, we need to use the TreeSet class that
implements it.

Methods of SortedSet:
first( - returns the first element of the set
last() - returns the last element of the set
headSet (element) - returns all the elements of the set
before the specified element
tailSet (element) - returns all the elements of the set
after the specified element including the specified
element
subSet(element1, element2) - returns all the elements
between the element1 and element2 including element1
*/

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex_66 {
    public static void main(String[] args) {
        SortedSet<Integer> sset = new TreeSet<>();
        sset.add(2);
        sset.add(4);
        sset.add(4);
        sset.add(3);
        sset.add(1);

        System.out.println("content of sorted set :" + sset);
        System.out.println("first element in set :" + sset.first());
        System.out.println("last element in set :" + sset.last());
    }
}
