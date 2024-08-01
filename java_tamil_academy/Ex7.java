public class Ex7 {

}

class FibonacciExample1 {

    public static void main(String args[]) {

        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + "" + n2);// printing 0 and 1

        for (i = 2; i < count; ++i) {// loop starts from 2 because 0 and 1 are already printed
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

class FactorialExample {

    public static void main(String args[]) {

        int i, fact = 1;
        int number = 5;// It is the number to calculate factorial
        for (i = 1; i <= number; i++) {

            fact = fact * i;

            System.out.println("Factorial of " + number + " is: " + fact);

        }
    }
}

class Largest {

    public static void main(String[] args) {

        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

    }
}

class ReverseNumberExample1 {
    public static void main(String[] args) {
        int number = 1234, reverse = 0;
        while (number != 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}

class DisplayEvenNumbersExample1 {
    public static void main(String args[]) {
        int number = 100;
        System.out.print("List of even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {

            // logic to check if the number is even or not
            // if i%2 is equal to zero, the number is even
            if (i % 2 == 0) {
                System.out.print(i + "");
            }
        }
    }

}

class GfG {

    public static void main(String[] args) {

        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x=" + x);
        System.out.println("y =" + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}