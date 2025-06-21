public class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }

    public static void main(String[] args) {
        Manager m = new Manager(50000, 15000);
        System.out.println("Manager salary: " + m.calculateSalary());
    }
}
