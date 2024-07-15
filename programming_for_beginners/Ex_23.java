/*
 * #23 - this Keyword in Java Programming
In Java, this keyword is used to refer to the current
object inside a method or a constructor. For example,
I
- Using this for Ambiguity Variable Names
class MyClass {
// instance variable
int age;

// parameter
MyClass(int age){
age = age;

}
}
 */
public class Ex_23 {
    public static void main(String[] args) {
        MyClass class1 = new MyClass(21);
        class1.displayAge();
    }
}

class MyClass {
    // instance variable
    int age;

    // parameter
    MyClass(int age) {
        age = age;

    }

}
