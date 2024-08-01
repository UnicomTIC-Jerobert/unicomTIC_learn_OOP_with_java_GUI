public class Ex14 {

}

class sum {
    int a = 10;

    void add(int a) {

        this.a = this.a + 20;
        a = a + 20;
        System.out.println(this.a);
        System.out.println(a);
    }

    public static void main(String args[]) {

        sum s1 = new sum();
        s1.add(20);
    }
}