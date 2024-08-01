public class Ex4_OperatorExample {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a + b);// 15
        System.out.println(a - b);// 5
        System.out.println(a * b);// 50
        System.out.println(a / b);// 2
        System.out.println(a % b);// 0
    }

}

class OperatorExample1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        a += 4;// a=a+4 (a=10+4)
        b -= 4;// b=b-4(b=20-4)
        System.out.println(a);
        System.out.println(b);
    }
}

class relational {
    public static void main(String[] args) {

        // create variables
        int a = 7, b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // =operator
        System.out.println(a == b); // false

        // != operator
        System.out.println(a != b); // true

        // > operator
        System.out.println(a > b); // false

        // < operator
        System.out.println(a < b); // true

        // >= operator
        System.out.println(a >= b); // false

        // <= operator
        System.out.println(a <= b); // true
    }
}

class logical {
    public static void main(String[] args) {

        // && operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false

        // || operator
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println((5 > 3) || (8 < 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false

        // ! operator
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false
    }
}

class ternary {
    public static void main(String args[]) {
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
    }
}

class unary1 {
    public static void main(String args[]) {
        int x = 10;
        System.out.println(x++);// 10 (11)
        System.out.println(++x);// 12
        System.out.println(x--);// 12 (11)
        System.out.println(--x);// 10
    }
}