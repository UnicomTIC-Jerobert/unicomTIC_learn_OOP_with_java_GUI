/*
 * #18 - Methods or Functions in Java Programming
A method is a block of code that performs a specific
task.

Suppose you need to create a program to create a
circle and color it. You can create two methods to
solve this problem:
1. a method to draw the circle
2. a method to color the circle

Dividing a complex problem into smaller chunks makes
your program easy to understand and reusable.

Declaring a Java Method:
modifier static returnTyper nameOfMethod (parameter1,
parameter2, ... ) {
// method body

}

 */

public class Ex_18 {
    public static void main(String[] arguments) {
        addNumber(10, 20);
        addNumber(5, 6);
    }

    static void addNumber(int a, int b) {
        int sum = +b;
        System.out.println("sum of numbers is " + sum);
    }

    // public static void main(String[] arguments) {
    //     int total = addNumber(10, 20);
    //     System.out.println("total of numbers is " + total);
    // }

    // static int addNumber(int a, int b) {
    //     int sum = a + b;
    //     return sum;

    // }

}
