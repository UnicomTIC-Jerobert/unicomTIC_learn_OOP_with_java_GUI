/*
#4 - Arithmetic Operators - How to Add Two Numbers in Java
+ Add
- Subtract
* Multiply
/ Divide
% Remainder
++ increment
-- decrement
*/

public class Ex_04_ArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 12;

        int sum = number1 + number2;
        System.out.println("the sum is : " + sum);

        int difference = number1 - number2;
        System.out.println("the difference is : " + difference);

        int product = number1 * number2;
        System.out.println("the product is : " + product);

        int divide = number1 / number2;
        System.out.println("the divide is : " + divide);

        int remainder = number1 % number2;
        System.out.println("the remainder is : " + remainder);

        int numberPlus = 1;
        numberPlus++;
        System.out.println("increment is : " + numberPlus);
        ++numberPlus;
        System.out.println("increment is : " + numberPlus);

        int numberMinus = 1;
        numberMinus--;
        System.out.println("decrement is : " + numberMinus);
        --numberMinus;
        System.out.println("decrement is : " + numberMinus);
    }
}
