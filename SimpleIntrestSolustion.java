// 2. Write a Java program to create a class called “Simple Interest” with a data fields principle,
// time and rate, using setter getter method and print the values.

import java.util.Scanner;
class SimpleIntrest{
    private Double P;
    private Double T;
    private Double R;

    public void setP(Double P){
        this.P=P;
    }
    public Double getP(){
        return P;  
    }

    public void setT(Double T){
        this.T=T;
    }
    public Double getT(){
        return T;
    }

    public void setR(Double R){
        this.R=R;
    }
    public Double getR(){
        return R;
    }
    public void getSimpleIntrest(){
        Double si = (P*T*R)/100;
        System.out.println("Simple Intrest: "+ si);
    }

}
public class SimpleIntrestSolustion {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        SimpleIntrest s1 = new SimpleIntrest();
        System.out.print("Enter Principle: ");
        Double principle = sc.nextDouble();
        s1.setP(principle);
        System.out.print("Enter Time: ");
        Double time = sc.nextDouble();
        s1.setT(time);
        System.out.print("Enter Rate: ");
        Double rate = sc.nextDouble();
        s1.setR(rate);

        s1.getSimpleIntrest();

        sc.close();

    }
    
}
