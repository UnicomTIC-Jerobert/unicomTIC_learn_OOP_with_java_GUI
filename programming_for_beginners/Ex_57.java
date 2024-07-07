/*
#57 - Java LinkedHashMap Class with Examples
The LinkedHashMap class of the Java collections
framework provides the hash table and linked list
implementation of the Map interface.

It extends the HashMap class to store its entries in
a hash table. It internally maintains a doubly-linked
list among all of its entries to order its entries.

LinkedHashMap preserves the order of elements added.
But it takes more memory due to double linked list

Examples:
- Create a LinkedHashMap
- Add elements in LinkedHashMap
- Access elements of LinkedHashMap
- Replace elements in LinkedHashMap
- Remove elements from LinkedHashMap
*/

import java.util.LinkedHashMap;

public class Ex_57 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("One", 1);
        lhm.put("Three", 3);
        lhm.put("Two", 2);
        lhm.put("Four", 4);

        System.out.println("linked hashmap content : " + lhm);
        System.out.println("value of key = two : " + lhm.get("two"));
    }
}
