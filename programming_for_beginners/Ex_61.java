/*
#61 - Java TreeMap Class with Examples
The TreeMap class of the Java collections framework
provides the tree data structure implementation.
It implements the NavigableMap interface.

TreeMap<Key, Value> numbers = new TreeMap<>();

Methods :
- Create a TreeMap
- Add elements in TreeMap (put, putAll, etc.)
- Access elements of TreeMap (get and getOrDefault)
- Remove elements from TreeMap (remove)
- Replace elements from TreeMap (replace and replaceAll)
*/

import java.util.TreeMap;

public class Ex_61 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(1, "One");
        tmap.put(2, "Two");
        tmap.put(3, "Three");
        tmap.put(4, "Four");

        TreeMap<Integer, String> tmap1 = new TreeMap<>();
        tmap1.putAll(tmap);
        tmap1.put(4, "Five");

        System.out.println("treemap content : " + tmap);
        tmap.remove(3);
        System.out.println("treemap content : " + tmap);

        System.out.println("treemap content : " + tmap);
        tmap.replace(4, "Forty");
        System.out.println("treemap content:" + tmap);
    }
}
