import java.util.Scanner;

abstract class Shapes {
    abstract void calculateArea();
}

class Rectangle extends Shapes {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}

class Circle extends Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}

class Triangle extends Shapes {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is: " + area);
    }
}

public class ShapeAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter first side of triangle: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side of triangle: ");
        double c = sc.nextDouble();

        Shapes shape;

        System.out.println();
        shape = new Rectangle(length, breadth);
        shape.calculateArea();

        System.out.println();

        shape = new Circle(radius);
        shape.calculateArea();

        System.out.println();

        shape = new Triangle(a, b, c);
        shape.calculateArea();

        sc.close();
    }
}
