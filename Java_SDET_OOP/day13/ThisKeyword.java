package day13;

public class ThisKeyword {

    int x, y; // class variables/instance variables

    ThisKeyword(int a, int b) {

        x = a;
        y = b;

    }

    void display() {

        System.out.println();
    }

    public static void main(String[] args) {
        // ThisKeyword th=new ThisKeyword(100,200);

        ThisKeyword th = new ThisKeyword();
        th.setData(100, 200);
        th.display();
    }
}
