package AbstractionConcept;
abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();

}
class Car extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Car's engine has started");
    }
    void stopEngine(){
        System.out.println("Car has stopped");
    }
}
class Motorcycle extends Vehicle{
     @Override
    void startEngine(){
        System.out.println("Bike's engine has started");
    }
    void stopEngine(){
        System.out.println("Motorcycle has stopped");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Car corolla = new Car();
        Motorcycle tvs = new Motorcycle();
        corolla.startEngine();
        tvs.startEngine();
        corolla.stopEngine();
        tvs.stopEngine();
    }
    
}
