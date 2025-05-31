// 5. You are building an employee management system and need to create an Employee  class. The Employee class should 
// have private instance variables for the employee name, employee ID, and salary. Implement getter and setter methods 
// for the name and ID, but ensure that the salary can only be updated through a specific method that increases or decreases 
// the amount while preventing negative values.

public class Employee {
    // Private instance variables
    private String name;
    private String employeeId;
    private double salary;

    // Constructor
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for salary (read-only)
    public double getSalary() {
        return salary;
    }

    // Method to update salary (increase or decrease)
    public void updateSalary(double amount) {
        double newSalary = salary + amount;
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Salary update failed: salary cannot be negative.");
        }
    }
}
