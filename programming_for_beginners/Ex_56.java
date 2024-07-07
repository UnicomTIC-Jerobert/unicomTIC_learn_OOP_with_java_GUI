/*
#56 - Java HashMap Class with Examples
The HashMap class of the Java collections framework
provides the functionality of the hash table data
structure.
It stores elements in key/value pairs. Here, keys are
unique identifiers used to associate each value on a
map.

The HashMap class implements the Map interface.

Examples:
- Create a Hashmap
- Add elements in Hashmap
- Access elements of Hashmap
- Replace elements in Hashmap
- Remove elements from Hashmap
*/

import java.util.HashMap;

public class Ex_56 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "One");
        hmap.put(2, "Two");
        hmap.put(3, "Three");
        hmap.put(4, "Four");

        System.out.println("hashmap content is : " + hmap);
        System.out.println("value of key = 3 is : " + hmap.get(3));

        hmap.replace(1, "Eleven");
        System.out.println("value of key=1 is : " + hmap.get(1));

        hmap.remove(3);
        System.out.println("hashmap content is : " + hmap);

    }
}
