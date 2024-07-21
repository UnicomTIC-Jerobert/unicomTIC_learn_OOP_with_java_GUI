/*
 * #10 - For Loop in Java Programming
for (int i=0;i<5;i++) {}
 */
public class Ex10_ForLoop {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        for (int i = 0; i <= 5; i++) {
            System.out.println("value of i is " + i);
        }

        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println("value of i is " + i);

            System.out.println("latest value of i is " + i);
        }

        int j = 1;
        for (; j <= 5; j += 2) {
            System.out.println("value of i is " + j);
            System.out.println("latest value of i is " + j);
        }
    }
}
