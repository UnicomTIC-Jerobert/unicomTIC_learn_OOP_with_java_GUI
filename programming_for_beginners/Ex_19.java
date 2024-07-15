/*
#19 - Method Overloading in Java Programming
In Java, two or more methods may have the same name
if they differ in parameters (different number of
parameters, different types of parameters, or both).

For example:
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }

Why method overloading?
Suppose, you have to perform the addition of given
numbers but there can be any number of arguments
(let's say either 2 or 3 arguments for simplicity).

In order to accomplish the task, you can create two
methods sum2num(int, int) and sum3num(int, int, int)
for two and three parameters respectively.
*/

public class Ex_19 {
    public static void main(String[] arguments) {
        addNumbers(10, 20, 30);
    }

    static void addNumbers(int a, int b) {
        System.out.println("sum is " + (a + b));
    }

    static void addNumbers(int a, int b, int c) {
        System.out.println("sum is " + (a + b + c));

    }

}
