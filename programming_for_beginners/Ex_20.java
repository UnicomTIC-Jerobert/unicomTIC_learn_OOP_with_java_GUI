/*
#20 - Java Constructors for Class Objects
A constructor in Java is similar to a method that is
invoked when an object of the class is created.

Unlike Java methods, a constructor has the same name
as that of the class and does not have any return
type. For example,
class Test {
Test() {
// constructor body

}

}

In Java, constructors can be divided into 3 types:

1. No-Arg Constructor
private Constructor() {
// body of the constructor
}

2. Parameterized Constructon
private Constructor(parameter provided) {
// body of the constructor

}

3. Default Constructor
If we do not create any constructor, the Java
compiler automatically create a no-arg constructor
during the execution of the program.
*/
public class Ex_20 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Cat";
        animal1.displayName();

        Animal animal1 = new Animal();
        animal1.displayName();
        Animal animal2 = new Animal();
        animal2.displayName();
    }

    class Animal {
        String name;

        Animal(String text) {
            name = text;

        }

        void displayName() {
            System.out.println("name of animal is " + name);
        }
    }
}
