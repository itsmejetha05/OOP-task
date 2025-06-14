package AbstractionConcept;
interface Employee {
    void work();
    double getSalary();
}
class Chef implements Employee {
    private double salary;

    Chef(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Chef is preparing delicious meals.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
class Waiter implements Employee {
    private double salary;

    Waiter(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Waiter is serving food to customers.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Employee chef = new Chef(40000);
        Employee waiter = new Waiter(25000);

        System.out.println("--- Employee Details ---");

        chef.work();
        System.out.println("Chef's Salary: Rs. " + chef.getSalary());

        System.out.println();

        waiter.work();
        System.out.println("Waiter's Salary: Rs. " + waiter.getSalary());
    }
}
