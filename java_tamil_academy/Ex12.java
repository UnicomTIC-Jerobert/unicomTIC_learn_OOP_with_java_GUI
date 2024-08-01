public class Ex12 {

}

// Let us see another example of default constructor
// which displays the default values
class Student6 {
    int id;
    String name;

    Student6() {

        id = 101;
        name = "hema";

    }

    // method to display the value of id and name
    void display() {
        System.out.println(id + "" + name);
    }

    public static void main(String args[]) {
        // creating objects
        Student6 s1 = new Student6();
        Student6 s2 = new Student6();
        // displaying values of the object
        s1.display();
        s2.display();
    }
}

// Java Program to create and call a default constructor
class Bike1 {

    // creating a default constructor
    Bike1() {
        System.out.println("Bike is created");
    }

    // main method
    public static void main(String args[]) {

        // calling a default constructor
        Bike1 b = new Bike1();
    }
}

// Java Program to create and call a default constructor
class Bike1 {

    // creating a default constructor
    int r;
    String name;

    // main method
    public static void main(String args[]) {

        // calling a default constructor
        Bike1 b = new Bike();
        System.out.println(b.r + " " + b.name);
    }
}

class Student44 {

    int id;
    String name;

    // creating a parameterized constructor
    Student44(int i, String n) {

        id = i;
        name = n;
    }

    // method to display the values
    void display() {

        System.out.println(id + " " + name);

    }

    public static void main(String args[]) {

        // creating objects and passing values
        Student44 s1 = new Student44(111, "Karan");
        Student44 s2 = new Student44(222, "Aryan");
        // calling method to display the values of object
        s1.display();
        s2.display();
    }
}

// Java program to overload constructors
class Student55 {

    int id;
    String name;
    int age;

    // creating two arg constructor
    Student55(int i, String n) {

        id = i;
        name = n;
    }

    // creating three arg constructor
    Student55(int i, String n, int a) {

        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student55 s1 = new Student55(111, "Karan");
        Student55 s2 = new Student55(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

// Java program to initialize the values from one object to another object.
class Student66 {

    int id;
    String name;

    // constructor to initialize integer and string
    Student66(int i, String n) {

        id = i;
        name = n;
    }
    // constructor to initialize another object

    // constructor to initialize another object
    Student66(Student66 s) {

        id = s.id;
        name = s.name;
    }

    void display() {

        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {

        Student66 s1 = new Student66(111, "Karan");
        Student66 s2 = new Student66(s1);
        s1.display();
        s2.display();
    }
}