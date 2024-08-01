/*
#12

- Control Statements in Java Programming - break and continue
break - breaks the flow of execution in loops
continue - continues the flow of execution to next iteration
*/
public class Ex_12_BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
