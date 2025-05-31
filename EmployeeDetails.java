// 4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, 
// and methods to calculate and update salary.
import java.util.Scanner;

class Employee{
    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary){
        this.name= name;
        this.job=job;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setJob(String job){
        this.job=job;
    }
    public String getJob(){
        return job;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

    public void seeDetails(){

        System.out.println("Name: "+name + ", "+"job: "+job+" ,"+"salary: "+ salary);
    }

}
public class EmployeeDetails {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Update salary");
        Employee p1 = new Employee("Niraj", "Cook", 50000);
        p1.seeDetails();

        System.out.println();

        System.out.print("Enter updated salary: ");
        int newSalalry = sc.nextInt();
        p1.setSalary(newSalalry);
        System.out.println();

        System.out.println("After update salary");
        p1.seeDetails();

        sc.close();



    }
}
