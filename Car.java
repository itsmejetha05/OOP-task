// 6. You are designing a car rental system, and you need to create a Car class. 
// The Car class should have private instance variables for the car's make, model, and rental price per day. 
// Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only 
// be set once during object creation. Additionally, include a private variable to track the availability of the car 
// (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car, 
// updating its availability status.

public class Car {
    // Private instance variables
    private final String make;  // set once in constructor
    private final String model; // set once in constructor
    private double rentalPricePerDay;
    private boolean isAvailable;

    // Constructor
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true; // Available by default
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for rental price
    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            this.rentalPricePerDay = price;
        } else {
            System.out.println("Rental price must be non-negative.");
        }
    }

    // Rent the car
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    // Return the car
    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car is already available.");
        }
    }
}
