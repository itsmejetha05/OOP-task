public class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Geometry geo = new Geometry();

        System.out.println("Area of circle: " + geo.calculateArea(7.0));
        System.out.println("Area of rectangle: " + geo.calculateArea(5.0, 6.0));
        System.out.println("Area of triangle: " + geo.calculateArea(4.0, 3.0, true));
    }
}
