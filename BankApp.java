class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account acc;

        acc = new SavingsAccount(10000);
        System.out.println("Savings interest: " + acc.calculateInterest());

        acc = new FixedDepositAccount(10000);
        System.out.println("Fixed deposit interest: " + acc.calculateInterest());
    }
}
