/*
 * #48 - Java ArrayList vs Array with Examples
In Java, we use the ArrayList class to implement the
functionality of resizable-arrays.
For array, we need to declare the size of an array
before we can use it.
Once the size of an array is declared, it's hard to
change it.

Examples:
1. Add Elements to an ArrayList
2. Access ArrayList Elements
3. Remove ArrayList Elements
 */

import java.util.ArrayList;

public class Ex_48 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("list content is " + myList);

        for (int i : myList) {
            System.out.print(i + "");
        }
        System.out.println();
        myList.remove(1);
        System.out.println("list content is " + myList);
    }
}
