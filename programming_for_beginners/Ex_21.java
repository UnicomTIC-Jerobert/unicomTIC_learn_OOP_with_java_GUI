/*
 * #21 - Strings in Java Programming
In Java, a string is a sequence of characters. For
example, "hello" is a string containing a sequence of
characters 'h', 'e', 'l', 'l', and 'o'.

We use double quotes to represent a string in Java.
For example,

// create a string
String type = "Programming for Beginners";

// create a string
String type = "Programming for Beginners";

Some important methods:
1. Get length of a String - string.length();
2. Join Two Java Strings - string1.concat(string2);
3. Compare two Strings - first.equals(second);

 */

public class Ex_21 {
    public static void main(String[] args) {
        String name = "hello";
        System.out.println(name.length());

        String name = "hello ";
        String name1 = "world";
        System.out.println(name.concat(name1));

        String name = "hello";
        String name1 = "hello";
        System.out.println(name.indexOf('o'));
    }
}
