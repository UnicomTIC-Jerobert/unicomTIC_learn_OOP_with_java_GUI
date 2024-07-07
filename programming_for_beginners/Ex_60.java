/*
 * #60 - Java SortedMap Interface with Examples
The SortedMap interface of the Java collections
framework provides sorting of keys stored in a map.
It extends the Map interface.

Since SortedMap is an interface, we cannot create
objects from it.
In order to use the functionalities of the SortedMap
interface, we need to use the class TreeMap that
implements it.

Methods:
comparator() - returns a comparator that can be used to order keys in a map
firstKey() - returns the first key of the sorted map
lastKey() - returns the last key of the sorted map
 */

import java.util.SortedMap;
import java.util.TreeMap;

public class Ex_60 {
    public static void main(String[] args) {
        SortedMap<Integer, String> smap = new TreeMap<>();
        smap.put(2, "Two");
        smap.put(4, "Four");
        smap.put(3, "Three");
        smap.put(1, "One");

        System.out.println("map content is :" + smap);
        System.out.println("first key is:" + smap.firstKey());
        System.out.println("last key is:" + smap.lastKey());
    }
}
