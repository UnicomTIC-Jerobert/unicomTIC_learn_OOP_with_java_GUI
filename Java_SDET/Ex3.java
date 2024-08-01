@FunctionalInterface
interface Cab {

    public void bookCab(String source, String destination);
}

public class Ex3 {
    public static void main(String[] args) {
        Cab cab = (source, destination) -> System.out.println("Ola cab is booked from" + source + "To " + destination);
        cab.bookCab("Hyd", "Mumbai");
    }
}
