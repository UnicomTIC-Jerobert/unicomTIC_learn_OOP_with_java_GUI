@FunctionalInterface
interface Cab {

    public void bookCab();
}

public class Ex1 {
    public static void main(String[] args) {

        Cab cab = () -> System.out.println("Ola cab is booked ... ");
        cab.bookCab();

    }
}