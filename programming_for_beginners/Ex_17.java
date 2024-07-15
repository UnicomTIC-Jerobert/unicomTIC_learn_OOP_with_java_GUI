/**
 * #17 - Java Class and Objects in Java Programming
 * Java is an object-oriented programming language. The
 * core concept of the object-oriented approach is to
 * break complex problems into smaller objects.
 * 
 * An object is any entity that has a state and
 * behavior. For example, a bicycle is an object. It has
 * States: idle, first gear, etc
 * Behaviors: braking, accelerating, etc.
 * 
 * class ClassName
 * // fields
 * // methods
 * 
 * {
 * 
 * }
 * 
 * Java Objects
 * An object is called an instance of a class.
 */
public class Ex_17 {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Dog";
        animal1.displayName();

        Animal animal2 = new Animal();
        animal2.name = "Tiger";
        animal2.displayName();
    }
}

class Animal {
    String name;

    void displayName() {
        System.out.println("name of animal is " + name);
    }
}