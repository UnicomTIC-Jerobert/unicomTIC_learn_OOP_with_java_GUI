public class Ex16 {

}

// super is used to refer immediate parent class instance variable.
class Animal {

    String color = "white";

}

class Dog extends Animal {

    String color = "black";

    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
}

class TestSuper1 {

    public static void main(String args[]) {

        Dog d = new Dog();
        d.printColor();
    }
}

// super can be used to invoke parent class method
class Animal {

    void eat() {

        System.out.println("eating ... ");
    }

}

class Dog extends Animal {

    void eat() {
        System.out.println("eating bread ... ");
    }

    void bark() {
        System.out.println("barking ... ");
    }

    void work() {
        super.eat();
        bark();
    }

}

class TestSuper2 {

    public static void main(String args[]) {

        Dog d = new Dog();
        d.work();
    }
}

/* --------------------------------------------------- */

class Bike9 {

    final int speedlimit = 90;// final variable

    void run() {

        speedlimit = 400;
    }

    public static void main(String args[]) {

        Bike9 obj = new Bike9();
        obj.run();
    }

}// end of class

/* ------------------------------------------------------------ */

class Bike {

    final void run() {
        System.out.println("running");
    }

}

class Honda extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {

        Honda honda = new Honda();
        honda.run();
    }
}

// ---------------------------------------------------

class Simpleinstance1 {

    public static void main(String args[]) {

        Simpleinstance1 s = new Simpleinstance1();
        System.out.println(s instanceof Simpleinstance1);// true
    }
}

// ------------------------------------------------------

interface printable {

    void print();
}

class A6 implements printable {

    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {

        A6 obj = new A6();
        obj.print();
    }
}

// --------------------------------------------------
interface Printable {

    void print();
}

interface Showable {

    void show();
}

class A7 implements Printable, Showable {

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {

        A7 obj = new A7();
        obj.print();
        obj.show();
    }

}

// ------------------------------------------------
class AbsExample1 {

    public static void main(String args[]) {

        int x = 78;
        int y = -48;
        int a = 20;
        int b = 50;

        // print the absolute value of int type
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.cbrt(64));
        System.out.println(Math.pow(5, 3));
    }
}