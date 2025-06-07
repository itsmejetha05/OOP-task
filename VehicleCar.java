/* Write a Java program to create a class called Vehicle
 with a method called drive(). Create a subclass called Car 
 with method display() method to print details of the Car.*/
package InheritanceConcept;
// parent class
class Vehicle{
    public void drive(){
        System.out.println("The car needs to be drived.");
    }

}
// sub-class or child class
class Car extends Vehicle{
    public String brand;
    public void display(){
        System.out.println("Details of a car.");
        System.out.println("The brand is "+brand);
    }

}

public class VehicleCar {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.brand="Toyota";
        obj.display();
        obj.drive();
    }

    
}