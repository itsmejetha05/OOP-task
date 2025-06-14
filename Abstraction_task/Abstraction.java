package AbstractionConcept;
//process of hiding implementation details and showing only the working feature
    // 1. Abstract class : 0% to 100% abstraction
    // 2. Interface: 100% abstraction\

abstract class MyLaptop{
    // cannot instatntiate abstract class -- no objects
    public MyLaptop(){
        System.out.println("lappy"); //Parametarized constructor huda default sidhai run hudaina pheri teslai ni child ma call garnu parxa
    }
    public MyLaptop(int num){
        System.out.println("Laptop Class num:"+num); //super to call parameterized constructor

    }
    void greet(){
        System.out.println("hello");
    }
    // abstract keyword to make abstract class and abstract methods in them
    // abstract class ko object hudaina ani abstract method ko body hudaina
    
    abstract void printName();  // Abstract -- no method body[abstract class bhitra abstract method banauna matra]

}
class Asus extends MyLaptop{
    //can only extend one class
    public Asus(int num){
        super(num);
    }
    public Asus(){
        
    }

    @Override
    void printName() {
        System.out.println("I am Asus");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Asus myAsus = new Asus();
        myAsus.greet();
        myAsus.printName();
    }
}
