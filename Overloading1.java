import java.util.*;

public class Overloading1 {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Overloading1 obj1 = new Overloading1();
        obj1.add(2, 5);
        obj1.add(1, 33, 44);
    }

}
