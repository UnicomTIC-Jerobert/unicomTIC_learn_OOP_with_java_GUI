/*
 * #58 - Java WeakHashMap Class with Examples.
The WeakHashMap class of the Java collections
framework provides the feature of the hash table data
structure ..
It implements the Map interface.

Difference Between HashMap and WeakHashMap
All functionalities of hashmaps and weak hashmaps are
similar except keys of a weak hashmap are of weak
reference, whereas keys of a hashmap are of strong
reference.

Example:
// Creating WeakHashMap of numbers
WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

 */

import java.util.WeakHashMap;

public class Ex_58 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap:" + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection : ");
    }
}
