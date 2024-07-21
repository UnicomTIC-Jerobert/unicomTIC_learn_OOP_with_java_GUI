/*
 * #14 - Arrays in Java Programming - Java Arrays
An array is a collection of similar types of data.
For example, if we want to store the names of 100
people then we can create an array of the string type
that can store 100 names.

//declare array
String[] array = new String[100];

//declare and initialize and array
int[] age = {12, 4, 5, 2, 5};

 */
public class Ex_14_Arrays {
    public static void main(String[] args) {
        int[] arrayOfIntegers = { 1, 2, 3, 4, 5 };
        System.out.println(arrayOfIntegers);
        System.out.println(arrayOfIntegers[4]);

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            System.out.print(arrayOfIntegers[i] + " ");
        }
        
        System.out.println();

        String[] arrayOfString = { "Programming", "for", "Beginnrs" };

        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.print(arrayOfString[i] + " ");

        }

    }
}
