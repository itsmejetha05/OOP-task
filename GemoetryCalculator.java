/*. Imagine that you are building a geometry calculator 
program. You need to implement the calculation of areas for
different shapes, including rectangles, squares, and circles.
To achieve this, you decide to use a multilevel inheritance
hierarchy. */
package oopstask;



class Base{

    public void calculateArea(){
        System.out.println("Area");

    }
}
// class Rectangle 
class Rectangle extends Base{
    int length;
    int breadth;
    public Rectangle(int l,int b){
      this.length=l;
      this.breadth=b;

    }
    // overriding methods
    public void calculateArea(){
        int areaRect =  length*breadth;
        System.out.println("The rectangle area is :"+areaRect);
    }
}
// class square 
class Square extends Rectangle{

    public Square(int l){
     super(l,l);
      

    }
    // overriding methods
    public void calculateArea(){
        int areaSquare =  length*breadth;
        System.out.println("The square area is :"+  areaSquare );
    }
}
// class circles 
class Circles extends Base{
    int radius;
    float pie =(float) Math.PI;

    public Circles(int r){
      this.radius=r;
      

    }
    // overriding methods
    public void calculateArea(){
        float areaCircle =  pie*radius*radius;
        System.out.println("The circle area is :"+  areaCircle );
    }
}



public class GemoetryCalculator {
    public static void main(String[] args) {
        // obj for Circles
        Circles objC = new Circles(2);
        System.out.println("-------Circle------");
        objC.calculateArea();
        // obj for square
        Square objS = new Square(4);
         System.out.println("-------Square------");
        objS.calculateArea();
        // OBJ for rectangle
        Rectangle objR = new Rectangle(5,6);
         System.out.println("-------Rectangle------");
        objR.calculateArea();

    }
    
}