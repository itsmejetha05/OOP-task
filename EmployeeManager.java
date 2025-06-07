/*Write a Java program to create a class called Employee 
with methods called work() and getSalary(). Create a subclass
 called HRManager that overrides the work() method */
package InheritanceConcept;
class Employee{
    public void work(){
        System.out.println("The employee works");
    }
    public void getSalary(double salary){
        System.out.println("The salary of employee is "+salary);

    }

}
class HRManager extends Employee{
    //overrriding
   public void work(){
    System.out.println("Overriding work method of Employee.");
   }


}
public class EmployeeManager {
    public static void main(String[] args) {
        HRManager obj= new HRManager();
        obj.getSalary(1345.90);
        obj.work();
    }

    
}