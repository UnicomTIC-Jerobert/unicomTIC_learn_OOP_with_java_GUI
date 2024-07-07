/*
 * #55 - Java Map Interface with Examples
The Map interface of the Java collections framework
provides the functionality of the map data structure.
I
Elements of Map are stored in key/value pairs. Keys
are unique values associated with individual Values.

The Map interface maintains 3 different sets:
- the set of keys
- the set of values
- the set of key/value associations (mapping)

Classes that implement Map
Since Map is an interface, we cannot create objects
from it.
We can use below classes to create Objects:

- HashMap
- EnumMap
- LinkedHashMap
- WeakHashMap
- TreeMap

Methods :
put(K, V)
putAll()
putIfAbsent(K, V)
get(K)
keySet()
values()
entrySet()
 */

import java.util.HashMap;
import java.util.Map;

public class Ex_55 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        map.putIfAbsent(2, "Four");

        System.out.println("map content : " + map);

        System.out.println("all keys:" + map.keySet());
        System.out.println("all values :" + map.values());
    }
}
