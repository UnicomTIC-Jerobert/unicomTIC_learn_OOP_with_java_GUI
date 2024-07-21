/*
 * #7 - Assignment Operators in Java Programming
= (Simple Assignment)
+= (Add and Assignment)
-= (Subtract and Assignment)
*= (Multiply and Assignment)
/= (Divide and Assignment)
 */

public class Ex7_AssigmentOperators {
    public static void main(String[] args) {
        int number = 10;
        
        number += 15; // number = number + 5;
        System.out.println("value of number is " + number);

        number -= 15; // number = number - 5;
        System.out.println("value of number is " + number);

        number *= 15; // number = number * 5;
        System.out.println("value of number is " + number);

        number /= 15; // number = number / 5;
        System.out.println("value of number is " + number);
    }
}
