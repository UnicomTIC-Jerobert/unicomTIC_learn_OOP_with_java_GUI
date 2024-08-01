/*
 * #8 - Logical Operators in Java Programming
&& - And (A > 10 && B > 10) is False
- OR (A > 10 | | B > 10) is True
- NOT ! (A > 10) is True
 */

public class Ex_08_LogicalOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        if (num1 > 5 && num2 > 10) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
