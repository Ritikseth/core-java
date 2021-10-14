import java.util.*;
import java.lang.*;

class ATM {
    int bal = 1000;

    synchronized void checkBalance(String name) {
        System.out.print("Hello " + name + " your current balance is: ");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(bal);
    }

    synchronized void withdraw(String name, int amt) {
        System.out.print(name + " withdrawing...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(amt + " withdrawn");
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    Customer(String name, int amount, ATM atm) {
        this.name = name;
        this.amount = amount;
        this.atm = atm;
    }

    void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

class SynchronisationChallenge {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Ram", 500, atm);
        Customer c2 = new Customer("Laxman", 400, atm);
        c1.start();
        c2.start();
    }
}
