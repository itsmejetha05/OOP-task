// 3. Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class, set their attributes using the constructor and 
// modifythe attributes using the setter methods and print the updated values.
import java.util.Scanner;
class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }

    public void displayInfo(){
        System.out.println("Dog name: "+name+", "+"breed: "+breed);
    }


}
public class dogNameAndBreed {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Dog dog1 = new Dog("Buddy", "Golden Retriever ");

        System.out.println("Before modification:");
        dog1.displayInfo();

        System.out.println();

        System.out.print("Enter dog name: ");
        String name1=sc.nextLine();
        System.out.print("Enter dog breed: ");
        String breed1=sc.nextLine();
        dog1.setName(name1);
        dog1.setBreed(breed1);

        System.out.println();

        System.out.println("After Modification");
        dog1.displayInfo();

        sc.close();

    }
    
}
