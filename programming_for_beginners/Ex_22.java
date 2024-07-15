/*
 * #22 - Access Modifiers in Java Programming
In Java, access modifiers are used to set the
accessibility (visibility) of classes, interfaces,
variables, methods, constructors, data members, and
the setter methods. For example,

class Animal {
public void method1() { ... }
private void method2() { ... }
}

method1 is public - This means it can be accessed by
other classes.
method2 is private - This means it can not be
accessed by other classes.

Protected - declarations are visible within the
package or all subclasses

 */
public class Ex_22 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.method1();
    }

    
}

class Animal {
    private void method1() {
        System.out.println("this method is private");
    }

    public void method2() {
        System.out.println("this method is public");

    }

}