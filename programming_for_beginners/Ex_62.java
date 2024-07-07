/*
 * #62 - Java Set Interface with Examples
The Set interface of the Java Collections framework
provides the features of the mathematical set in
Java. It extends the Collection interface.
Unlike the List interface, sets cannot contain
duplicate elements.

Classes that implement Set:
- HashSet
- LinkedHashSet
- EnumSet
- TreeSet

// Set implementation using HashSet
Set<String> animals = new HashSet<>();

Set Methods:
add () method
addAll() method
iterator() method
remove () method
removeA11() method
clear() method
size() method
toArray() method
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_62 {
    public static void main(String[] args) {
        Set<String> animal = new HashSet<>();
        animal.add("Dog");
        animal.add("Tiger");
        animal.add("Cat");
        animal.add("Lion");

        System.out.println("set content is : " + animal);

        Iterator<String> it = animal.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        System.out.println("size of set :" + animal.size());
        animal.remove("Lion");
        System.out.println("size of set :" + animal.size());
    }
}
