package day13;

public class Staticdemo {
    static int a = 10; // static variable
    int b = 20; // non-static variable

    static void m1() {
        // static

        System.out.println("this is m1 static method .... ");
    }

    void m2() {

        // non-static method

        System.out.println("this is m2 non-static method .... ");

    }

    void m() // non-static method
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {
        

        //1) static methods can access static stuff directly ( without object).
        
        System.out.println(a);
        m1();
        
        //System.out.println(b); //cannot access, b is non-static
        //m2(); //cannot access, m2() is non-static
        
        //2) static methods can access non-static stuff through object.
        Staticdemo sd=new Staticdemo();
        System.out.println(sd.b);
        sd.m2();
    }
}
