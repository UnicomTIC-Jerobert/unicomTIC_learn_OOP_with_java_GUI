/*
 * #64 - Java EnumSet Class with Examples
The EnumSet class of the Java collections framework
provides a set implementation of elements of a single
enum.
It implements the Set interface.

Unlike other set implementations, the enum set does
not have public constructors. We must use the
predefined methods to create an enum set.
1. Using allOf() method
2. Using none0f() method
3. Using range(e1, e2) Method
4. Using of() Method

Methods :
- Insert Elements to EnumSet
- Access EnumSet Elements
- Remove EnumSet Elements

 */

import java.util.EnumSet;
import java.util.Iterator;



public class Ex_64 {

    public static void main(String[] arguments) {
        EnumSet<Size> e1set = EnumSet.allOf(Size.class);

        System.out.println("enum set content : " + e1set);

        EnumSet<Size> e2set = EnumSet.noneOf(Size.class);

        EnumSet<Size> e3set = EnumSet.of(Size.class,Size.LARGE);

        Iterator<Size> it = e3set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
    }
}

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}
