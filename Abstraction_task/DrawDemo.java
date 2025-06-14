package AbstractionConcept;

abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Cube: All sides equal
class Cube extends Draw {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }
}

// Cuboid: length, breadth, height
class Cuboid extends Draw {
    double length, breadth, height;

    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length * breadth * height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + breadth + height);
    }
}

// Cylinder: radius, height
class Cylinder extends Draw {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        // For cylinder, usually "perimeter" refers to the circumference of the base
        return 2 * Math.PI * radius;
    }
}

public class DrawDemo {
    public static void main(String[] args) {
        Draw cube = new Cube(5);
        System.out.println("Cube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Area: " + cube.calculateArea());
        System.out.println("Perimeter: " + cube.calculatePerimeter());
        System.out.println();

        Draw cuboid = new Cuboid(4, 3, 2);
        System.out.println("Cuboid:");
        System.out.println("Volume: " + cuboid.calculateVolume());
        System.out.println("Area: " + cuboid.calculateArea());
        System.out.println("Perimeter: " + cuboid.calculatePerimeter());
        System.out.println();

        Draw cylinder = new Cylinder(3, 7);
        System.out.println("Cylinder:");
        System.out.println("Volume: " + cylinder.calculateVolume());
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Perimeter (circumference): " + cylinder.calculatePerimeter());
    }
}

