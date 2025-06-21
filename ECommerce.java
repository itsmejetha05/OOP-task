abstract class Payment{
        abstract void validate();
        abstract void transaction(double amount);
}

class Creditcard extends Payment{

    @Override
    void validate() {
        System.out.println("Credit card is validating!!!");
    }

    @Override
    void transaction(double amount) {
        System.out.println("Payment of "+amount+" has been made");
    }
}

class Paypal extends Payment{
    @Override
    void validate() {
        System.out.println("Paypal is validating!!!");
    }

    @Override
    void transaction(double amount) {
        System.out.println("Payment of "+amount+" has been made");
    }

}

class BankTransfer extends Payment{
      @Override
    void validate() {
        System.out.println("Bank Account is validating!!!");
    }

    @Override
    void transaction(double amount) {
        System.out.println("Payment of "+amount+" has been made");
    }

}

public class ECommerce {
    public static void main(String[] args) {
        Payment card;
        card= new Creditcard(); 
        card.validate();
        card.transaction(852000);

        System.out.println();

        Payment paypal;
        paypal=new Paypal();
        paypal.validate();
        paypal.transaction(65200);

        System.out.println();

        Payment bank;
        bank=new BankTransfer();
        bank.validate();
        bank.transaction(462530);
    }
    
}
