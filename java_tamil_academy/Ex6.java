public class Ex6 {

}

class Calculattion {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;

            System.out.println("The sum of first 10 natural numbers is " + sum);
        }
    }
}

class Calculation1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;

        }
    }
}

class Calculation2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 10);

    }
}

class BreakExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
    }
}

class ContinueExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 0; i <= 2; i++) {

            for (int j = i; j <= 5; j++) {

                if (j == 4) {
                    continue;
                }

                System.out.println(j);
            }
        }
    }
}