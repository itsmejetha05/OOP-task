// 4. You are working on a student information system and need to create a Student class. The student class should 
// have private instance variables for the student's name, ID number, and grade point average (GPA). Implement getter 
// and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods. 
// However, the GPA should be read-only and can only be set within the class constructor.


public class Student {
    // Private instance variables
    private String name;
    private String idNumber;
    private double gpa;

    // Constructor to initialize all values
    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa; // GPA is set only once here
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for ID number
    public String getIdNumber() {
        return idNumber;
    }

    // Setter for ID number
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // Getter for GPA (read-only)
    public double getGpa() {
        return gpa;
    }
}
