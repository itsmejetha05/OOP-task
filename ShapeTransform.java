abstract class Shape {
    abstract void resize();
    abstract void rotate();
}

class CircleShape extends Shape {
    void resize() {
        System.out.println("Resizing circle...");
    }

    void rotate() {
        System.out.println("Rotating circle...");
    }
}

class SquareShape extends Shape {
    void resize() {
        System.out.println("Resizing square...");
    }

    void rotate() {
        System.out.println("Rotating square...");
    }
}

class TriangleShape extends Shape {
    void resize() {
        System.out.println("Resizing triangle...");
    }

    void rotate() {
        System.out.println("Rotating triangle...");
    }
}

public class ShapeTransform {
    public static void main(String[] args) {
        Shape shape;

        shape = new CircleShape();
        shape.resize();
        shape.rotate();

        System.out.println();

        shape = new SquareShape();
        shape.resize();
        shape.rotate();

        System.out.println();

        shape = new TriangleShape();
        shape.resize();
        shape.rotate();
    }
}
