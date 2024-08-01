interface Cab {
    public String bookCab(String source, String destination);
}

class Ola implements Cab {

    public String bookCab(String source, String destination) {
        System.out.println("Ola cab is booked from" + source + "To " + destination);
        return ("Price: 5000 Rs");
    }

}

public class Ex4 {
    public static void main(String[] args) {
        Cab cab = new Ola();
        System.out.println(cab.bookCab("Hyd", "Mumbai"));
    }
}