package AbstractionConcept;

abstract class Bird{
    abstract void fly();
}
class Eagle extends Bird{
    @Override
    void fly(){
        System.out.println("Eagle can Fly");
    }
}
class Penguin extends Bird{
    @Override
    void fly(){
        System.out.println("Penguin cannot fly");
    }

}
public class Birds{
    public static void main(String[] args) {
        Eagle e1 = new Eagle();
        e1.fly();
        Penguin p1 = new Penguin();
        p1.fly();
    }
}