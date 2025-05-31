// 1. Write a Java program to create a class called "Circle" with a radius attribute. 
// You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.
import java.util.Scanner;
class Circle{
    private Double radius;
    private Double pie;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setPie(double pie) {
        this.pie = pie;
    }
    public double getPie() {
        return pie;
    }


    public void getAreaOfCircle(){
        Double area = radius*pie;
        System.out.println("Area of circlce is : "+ area);
    }

    public void getCircumferenceOfCircle(){
        double circumference = 2*pie*radius;
        System.out.println("Circumference of area is : "+ circumference);
    }
}
public class AreaAndCircumferenceOfCircle{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter Radius: ");
        Double inputRadius =sc.nextDouble();
        c1.setRadius(inputRadius);
        Double pieValue = 3.14159;
        c1.setPie(pieValue);

        c1.getAreaOfCircle();
        c1.getCircumferenceOfCircle();
        
        sc.close();
        
    }
}