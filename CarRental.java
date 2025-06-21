abstract class Vehicle {
    abstract void calculateRental(int days);
}

class Car extends Vehicle {
    @Override
    void calculateRental(int days) {
        double cost = days * 50.0;
        System.out.println("Car rental for " + days + " days is: $" + cost);
    }
}

class Motorcycle extends Vehicle {
    @Override
    void calculateRental(int days) {
        double cost = days * 30.0;
        System.out.println("Motorcycle rental for " + days + " days is: $" + cost);
    }
}

class Bicycle extends Vehicle {
    @Override
    void calculateRental(int days) {
        double cost = days * 10.0;
        System.out.println("Bicycle rental for " + days + " days is: $" + cost);
    }
}

public class CarRental {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.calculateRental(5);

        System.out.println();

        v = new Motorcycle();
        v.calculateRental(3);

        System.out.println();

        v = new Bicycle();
        v.calculateRental(2);
    }
}
