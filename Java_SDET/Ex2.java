interface Cab {
    public void bookCab(String source, String destination);
}

class Ola implements Cab {

    public void bookCab(String source, String destination) {
        System.out.println("Ola cab is booked from" + source + "To " + destination);
    }

}

public class Ex2 {
    public static void main(String[] args) {
        Cab cab = new Ola();
        cab.bookCab("Hyd", "Mumbai");
    }
}
