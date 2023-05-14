abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }

}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        Shape r = new Rectangle();
        obj1.draw();
        r.draw();
    }

}
