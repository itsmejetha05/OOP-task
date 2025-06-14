package AbstractionConcept;
import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
}
class Rectangle extends Shape{
    int l,b;
    Rectangle(int l , int b){
        this.l=l;
        this.b=b;
    }
    @Override
    void calculateArea(){
        int area_rectangle=l*b;
        System.out.println("Area of rectangle: "+area_rectangle);
    }

}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    @Override
    void calculateArea(){
        double area_circle=3.14*r*r;
        System.out.println("Area of circle: "+area_circle);
    }

}
public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int l = sc.nextInt();
        System.out.print("Enter the breadth:");
        int b = sc.nextInt();
        System.out.print("Enter the radius:");
        int r = sc.nextInt();
        sc.close();
        Rectangle r1 = new Rectangle(l,b);
        r1.calculateArea();
        Circle c1 = new Circle(r);
        c1.calculateArea();

        
    }
    
}
