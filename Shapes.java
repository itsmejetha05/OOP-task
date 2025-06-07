package InheritanceConcept;
// base
class Shape{   
    // method
    public void calculateArea(){
        System.out.println("Area");

    }
}
class Rectangle extends Shape{
     // variables
    private int length;
    private int breadth;
   
    
    public Rectangle(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    public void calculatePerimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println("The perimeter of rectangle is "+perimeter);

    }
    // overiding for area
    public void calculateArea(){
        int area = length*breadth;
        System.out.println("The area of rectangle is "+area);
    }
}
// next sub class
class Circle extends Shape{
    // variables
    private double pie=3.14;
    private double radius;
    // constructor
    public Circle(double r){
        this.radius=r;
        // this.pie=p;
    }
    // method for circumference
    public void calculateCircumference(){
         double circumference =  2*pie*radius;
         System.out.println("The circumference of circle is "+circumference);
    }
    // overriding method for area of circle
    public void calculateArea(){
        double area = pie*radius*radius;
        System.out.println("The area of circle is "+area);
    }
}
public class Shapes {
    public static void main(String[] args) {
        // for rectangle
        System.out.println("Rectangle calculation .......");
        Rectangle objRect =  new Rectangle(2,2);
        objRect.calculatePerimeter();
        objRect.calculateArea();
        // for circle
        System.out.println("Circle calculation .........");
        Circle objCircle= new Circle(3.34);
        objCircle.calculateCircumference();
        objCircle.calculateArea();
    }
    
}