/*
 * #63 - Java HashSet Class with Examples
The HashSet class of the Java Collections framework
provides the functionalities of the hash table data
structure.
It implements the Set interface.

Methods:
- Insert Elements to HashSet - add()
- Access HashSet Elements - iterator
- Remove Elements

Set Operations:
- Union of Sets - addAll()
- Intersection of Sets - retainAll()
- Difference of Sets - removeAll()
 */

import java.util.HashSet;
import java.util.Iterator;

public class Ex_63 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(4);
        set2.add(5);

        set1.addAll(set2);
        set1.retainAll(set2);
        
        System.out.print("set content is : ");
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");

        }
    }
}
