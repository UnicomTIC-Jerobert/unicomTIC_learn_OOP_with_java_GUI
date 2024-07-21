/*
#3 - Java Variables & Data Types
Following are the types of variables in Java -
1. Local Variables - int, float, String, etc.
2. Class Variables (Static Variables)
3. Instance Variables (Non-static Variables)
*/

public class Ex3_JavaVariablesAndDataTypes {
    public static void main(String[] args) {
        int number1 = 11;
        System.out.println("the value of number1 is : " + number1);

        double number2 = 11.67;
        System.out.println("the value of number2 is : " + number2);

        float number3 = 11.67f;
        System.out.println("the value of number3 is : " + number3);

        String str = "Programming for beginners";
        System.out.println(str);
        str = "this is another statement";
        System.out.println(str);
    }
}
