/*
#65 - Java LinkedHashSet Class with Examples
The LinkedHashSet class of the Java collections
framework provides functionalities of both the
hashtable and the linked list data structure.
It implements the Set interface.

However, linked hash sets maintain a doubly-linked
list internally for all of its elements. The linked
list defines the order in which elements are inserted
in hash tables.

Methods:
- Insert Elements to LinkedHashSet
- Access LinkedHashSet Elements
- Remove Elements from HashSet
- You can also perform many other set operations

LinkedHashSet vs HashSet
- LinkedHashSet maintains a linked list internally
- The LinkedHashSet class requires more storage than
HashSet
- The performance of LinkedHashSet is slower than
HashSet. It is because of linked lists present in
LinkedHashSet.

*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex_65 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(5);
        lhs.add(3);
        lhs.add(4);

        // System.put.println("1hs_content is : "+ 1hs);
        Iterator<Integer> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");

        }
    }
}
