/*
 * #16 - for-each Loop in Java Programming
In Java, the for-each loop is used to iterate through
elements of arrays and collections (like ArrayList).
It is also known as the enhanced for loop.

//Syntax:
for(dataType item : array) {
}
 */
public class Ex_16_ForEach {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }

        String[] array2 = { "Programming", "for", "Beginners" };
        for (String str : array2) {
            System.out.println(str + " ");

        }

    }
}
