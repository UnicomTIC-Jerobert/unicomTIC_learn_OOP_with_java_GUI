/*
 * #86 - Java Scanner Class with Examples | Read user
Input & Add Two Numbers
The Scanner class of the java.util package is used to
read input data from different sources like input
streams, users, files, etc.

Working of Java Scanner
The Scanner class reads an entire line and divides the
line into tokens. Tokens are small elements that have
some meaning to the Java compiler.
Note: By default, whitespace is used to divide tokens.

Scanner Methods Examples:
- nextInt() - reads an int value from the user
- nextLine() - reads a line of text from the user
- next() - reads a word from the user

 */

import java.util.Scanner;

public class Ex_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text : ");
        String str = sc.nextLine();
        System.out.println("entered string is :" + str);
    }
}
