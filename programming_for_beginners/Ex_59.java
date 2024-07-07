/*
 * #59 - Java EnumMap Class with Examples
The EnumMap class of the Java collections framework
provides a map implementation for elements of an
enum.

In EnumMap, enum elements are used as keys. It
implements the Map interface.

Example:
enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}

EnumMap<Size, Integer> sizes = new EnumMap<>
(Size.class);

Methods :
- Create a EnumMap
- Add elements in EnumMap
- Access elements of EnumMap
- Remove elements from EnumMap

 */

import java.util.EnumMap;

public class Ex_59 {
    public static void main(String[] args) {
        EnumMap<Size, Integer> emap = new EnumMap<>(Size.class);
        emap.put(Size.SMALL, 1);
        emap.put(Size.MEDIUM, 2);
        emap.put(Size.LARGE, 3);
        emap.put(Size.EXTRALARGE, 4);

        System.out.println("enum map content : " + emap);
        System.out.println("enum map with key = LARGE : " + emap.get(Size.LARGE));

        emap.remove(Size.MEDIUM);
        System.out.println("enum map content :" + emap);

    }
}

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}