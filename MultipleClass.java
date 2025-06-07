package InheritanceConcept;
// base
class Book{
    // variables
    private String title;
    private String author;
    // constructor
    public Book(String t, String a){
        this.title=t;
        this.author=a;

    }
    public void displayDetails(){
        System.out.println("The title of  is "+title);
        System.out.println("The author is "+author);
    }

}
// sub1
class FictionBook extends Book{
    // constructor
    public FictionBook(String title, String author) {
        super(title, author);
    }
    public void Details(){
        System.out.println("Fictional Book detail");
        super.displayDetails();
    }
}
// sub2
class NonFictionBook extends Book{
    // constructor
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
    public void Details(){
        System.out.println("Non Fictional Book detail");
        super.displayDetails();
    }
}
// sub 3
class TechnicalBook extends Book{
    // constructor
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
    public void Details(){
        System.out.println("TechnicalBook  detail");
        super.displayDetails();
    }
}

public class MultipleClass {
    public static void main(String[] args) {
        // obj for sub 1
        FictionBook objF = new FictionBook("A fox", "James");
        objF.Details();
        // obj for sub2
        NonFictionBook objNF= new NonFictionBook("Different Ideas", "Anish");
        objNF.Details();
        // obj for sub3
        TechnicalBook objT = new TechnicalBook("A way to death", "Babita");
        objT.Details();
    }

    
}