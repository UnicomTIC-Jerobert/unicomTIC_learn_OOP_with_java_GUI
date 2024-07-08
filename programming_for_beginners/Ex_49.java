/*
 * #49 - Java Stack Class with Examples
The Java collections framework has a class named
Stack that provides the functionality of the stack
data structure.

Elements are stored and accessed in Last In First Out
manner

Stack Methods:
1. push() Method - add an element to the top of the
stack
2. pop() Method - remove an element from the top of
the stack
3. peek() Method - returns an object from the top of
the stack
4. search() Method - returns the position of the
element from the top of the stack
5. empty() Method - check whether a stack is empty or
not


 */

import java.util.Stack;

public class Ex_49 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        System.out.println("stack content is " + stack1);

        stack1.pop();
        System.out.println("stack content is " + stack1);
        stack1.pop();
        System.out.println("stack content is " + stack1);
        
        System.out.println("element at top is " + stack1.peek());
    }
}
