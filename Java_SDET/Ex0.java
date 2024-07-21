@FunctionalInterface
interface Cab {
    // this is abstract method
    public void bookCab();

}

class Ola implements Cab {

    public void bookCab() {
        System.out.println("Ola cab is booked ... ");
    }

    public void payCab() {
        System.out.println("Ola cab is payed ... ");
    }
}

public class Ex0 {

    public static void main(String[] args) {

        Ola cab1 = new Ola();
        cab1.bookCab();
        cab1.payCab();

        Cab cab2 = new Ola();
        cab2.bookCab();
        // cab2.payCab(); // we can't able access since object reference is based on Interface
    }
}