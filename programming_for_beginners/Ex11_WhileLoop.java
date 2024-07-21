/*
#11 - While Loop in Java Programming
while (i < 5) 

do {} while (i < 5)
 */

public class Ex11_WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        int j = 1;
        do {

            System.out.print(j + "");
            j++;
        } while (j < 1);

        
    }
}
