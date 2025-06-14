package AbstractionConcept;

interface Furniture{
    //only contains methods that are abstract[abstract afai hunxa lekhnu pardaina abstract keyword]
    //only contains constant attributes
    //interface ko no constructor
    void printLength();
}
// class extends class
// interface implements class
// interface extends interface
interface Furniture2 extends Furniture{
    void printHeight();
}
class Table implements Furniture2{

    @Override
    public void printHeight() {
    }

    @Override
    public void printLength() {
        
    }

}
public class InterfaceExample {
    
}
