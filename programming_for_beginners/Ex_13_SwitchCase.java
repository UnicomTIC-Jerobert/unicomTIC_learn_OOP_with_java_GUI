/*
 * #13 - Switch case in Java Programming - Java Switch Program
switch (expression)

{


case value1:
    // code
    break;

case value2:
    // code
    break;

...
...

default:
    // default statements

}
 */

public class Ex_13_SwitchCase {
    public static void main(String[] args) {
        int i = 1;

        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("value of i is : " + i);
        }
    }
}