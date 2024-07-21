interface Cab {
    public String bookCab(String source, String destination);
}

public class Ex5 {
    public static void main(String[] args) {
        Cab cab = (String source, String destination) -> {
            System.out.println("Ola cab is booked from" + source + "To" + destination);
            return ("Price: 5000 Rs");
        };

        System.out.println(cab.bookCab("Hyd", "Mumbai"));
    }
}