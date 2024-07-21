/*
 * #15 - Multidimensional Arrays in Java Programming
A multidimensional array is an array of arrays. Each
element of a multidimensional array is an array
itself.

Example: 3 * 4 matrix
int[][] a = new int[3][4];

Another example:
String[][][] data = new String[3][4][2];


 */
public class Ex_15_MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 11, 12, 13, 14 }
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = {
                { 1, 2, 3, 4, 5 },
                { 11, 12, 13, 14, 15 },
                { 21, 22, 23, 24, 25 },
                { 31, 32, 33, 34 - 35 }
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
