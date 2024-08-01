import java.util.*;

class co {
    String name;
    int age;

    void read() {

        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        name = s.nextLine();

        System.out.println("enter your age");
        age = s.nextInt();
    }

    void print() {
        System.out.println("the name is:" + name);
        System.out.println("the age is:" + age);
    }

    public static void main(String args[]) {

        co c1 = new co();
        cl.read();

        c1.print();
    }

}

class Student {
    int id;
    String name;
}

class TestStudent2 {

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Sonoo";
        System.out.println(s1.id + " " + s1.name);// printing members with a white space

        Student s2 = new Student();
        System.out.println(s2.id + " " + s2.name);
    }
}

class TestStudent3 {

    public static void main(String args[]) {

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        // Initializing objects
        s1.id = 101;
        s1.name = "Sonoo";
        s2.id = 102;
        s2.name = "Amit";
        // Printing data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}

class Student {

    int rollno;
    String name;

    void insertRecord(int r, String n) {

        rollno = r;
        name = n;
    }

    void displayInformation() {

        System.out.println(rollno + " " + name);
    }
}

class TestStudent4 {

    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "'Aryan");
        s1.displayInformation();
        s2.displayInformation();

    }
}