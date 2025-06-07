/*Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object. */
package InheritanceConcept;
// BASE CLASS
class Vehicle{
    // methods
    public void startEngine(){
        System.out.println("vehicle needs engine to start.");
    }
    public void stopEngine(){
        System.out.println("vehicle stops");
    }
}
// sub class
class Car extends Vehicle{
    // inheritance
  
    // method drive
    public void drive(){
          super.startEngine();
            
        System.out.println("Car drives.");
        super.stopEngine();
    }
}
class Motorcycle extends Vehicle{
    // method ride
    public void ride(){
        super.startEngine();
 
        System.out.println("Motorcycle needs to ride.");
        super.stopEngine();
    }
}
public class Hierarchy {
    public static void main(String[] args) {
        // object of motorcycle
        Motorcycle objMotorcycle = new Motorcycle();
        objMotorcycle.ride();

        // object of car
        Car objCar = new Car();
        
        objCar.drive();
        
    }

    
}