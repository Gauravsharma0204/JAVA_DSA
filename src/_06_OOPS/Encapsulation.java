package _06_OOPS;

public class Encapsulation {
    public static void main(String args[]){
        BankAccount acc = new BankAccount("12345", 1000);

        System.out.println("Account Noo " + acc.getAccountNumber());
        System.out.println("Balance : " + acc.getBalance());

        acc.deposite(500);
        acc.withdraw(200);
    }
}

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Onavalid Deposite Amount ");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Insufficient balance oor Invalid Amount ");
        }
    }
}
