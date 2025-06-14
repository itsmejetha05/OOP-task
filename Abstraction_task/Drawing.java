package AbstractionConcept;

import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
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
    @Override
    void calculatePerimeter(){
        int perimeter_rectangle=2*(l+b);
        System.out.println("Perimeter of rectangle: "+perimeter_rectangle);
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
    @Override
    void calculatePerimeter(){
        double perimeter_circle=2*(3.14*r);
        System.out.println("Perimeter of circle: "+perimeter_circle);
    }

}
class Triangle extends Shape{
    int base,h,a,c;
    Triangle(int base, int h,int a, int c){
        this.base = base;
        this.h=h;
        this.a=a;
        this.c=c;
    }
    @Override
    void calculateArea(){
        double area_triangle=0.5*base*h;
        System.out.println("Area of triangle: "+area_triangle);
    }
    @Override
    void calculatePerimeter(){
        double perimeter_triangle=a+base+c;
        System.out.println("Perimeter of triangle: "+perimeter_triangle);
    }

}
public class Drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle:");
        int b = sc.nextInt();
        System.out.print("Enter the radius of circle::");
        int r = sc.nextInt();
        System.out.print("Enter the height of traingle:");
        int h = sc.nextInt();
        System.out.print("Enter the base of traingle:");
        int base = sc.nextInt();
        System.out.print("Enter the other side of traingle:");
        int a = sc.nextInt();
        System.out.print("Enter the remaining side of traingle:");
        int c = sc.nextInt();
        sc.close();
        Rectangle r1 = new Rectangle(l,b);
        r1.calculateArea();
        r1.calculatePerimeter();
        Circle c1 = new Circle(r);
        c1.calculateArea();
        c1.calculatePerimeter();
        Triangle t1 = new Triangle(base,h,a,c);
        t1.calculateArea();
        t1.calculatePerimeter();


        
    }
    
}
