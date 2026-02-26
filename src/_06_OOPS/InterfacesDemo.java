package _06_OOPS;

interface Payment{
    void pay(double amount);
}

class UpiPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + "Using UPI");
    }
}

class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "Using Credit Card");
    }
}

public class InterfacesDemo {
    public static void main(String[] args){
        Payment p1 = new UpiPayment();
        Payment p2 = new CreditCardPayment();

        p1.pay(500);
        p2.pay(1200);
    }
}


