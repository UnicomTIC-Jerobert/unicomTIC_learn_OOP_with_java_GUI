/*
#6 - Equality and Relational Operators in Java
Programming
> Greater than (A > B) is False
Lesser than (A < B) is True
>= Greater than or equal to (A >= B) is False
<= Lesser than or equal to (A <= B) is True
== Equality (A == B) is False
!= Not equal (A != B) is True
 */
public class Ex6_EqualityAndRelaional {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        if (num1 < num2) {
            System.out.println("num1 is less than num 2");
        } else {
            System.out.println("num1 is not less than num 2");
        }

        if (num1 > num2) {
            System.out.println("num1 is greaer than num 2");
        } else {
            System.out.println("num1 is not greater than num 2");
        }

        if (num1 >= num2) {
            System.out.println("num1 is greaer than or equal to num 2");
        } else {
            System.out.println("num1 is not greater than num 2");
        }
    }
}
