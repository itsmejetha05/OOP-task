public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two ints: " + calc.add(5, 10));
        System.out.println("Add two doubles: " + calc.add(4.5, 3.2));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));
    }
}
