import java.lang.*;
import java.util.*;

class Account {
    private long accNo;
    private String username;
    private String address;
    private long phno;
    private String dob;
    protected long balance;

    public Account(long accNo, String username, String dob,String address,long phno) {
        this.accNo = accNo;
        this.username = username;
        this.dob = dob;
        this.address= address;
        balance = 0;
        this.phno = phno;
    }

    public void setAddr(String address) {
        this.address = address;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAccNo() {
        return accNo;
    }

    public String getName() {
        return username;
    }

    public String getAddr() {
        return address;
    }

    public long getPhno() {
        return phno;
    }

    public long getBalance() {
        return balance;
    }

    public String getdob() {
        return dob;
    }

    public void close() {
        System.out.println("Your Account has been closed, here are your details: " + toString());
    }

    public String toString() {
        return "\nAccount Number: " + accNo + "\nName: " + username + "\nAddress: " + address + "\nBalance: " + balance
                + "\nDob: " + dob + "\nPhno: " + phno;
    }
}

class SavingAccount extends Account {
    private int fd;
    public SavingAccount(long accNo, String username, String dob,String address,long phno) {
        super(accNo, username, dob,address, phno);
    }

    public void deposite(long amt) {
        balance+= amt;
        System.out.println("An amount of "+amt+" has been deposited to your account("+getAccNo()+")\nNew Balance is: " + getBalance());
    }

    public void withdraw(long amt) {
        if (balance > amt) {
            balance-= amt;
            System.out.println("An amount of "+amt+" has been deducted from your account("+getAccNo()+")\nNew Balance is: " + getBalance());

        }
        else
            System.out.println("Insufficient Balance");
    }
    public void fixedDeposite(int fd){
        this.fd = fd;
        System.out.println("An FD of "+fd+" has been fixed from your account "+getAccNo()+",Amount receive after maturity= "+fd*2);
    }
    public void liquidateFd(){
        System.out.println("Liquidation complete");
        deposite(fd);
    }
}

class PracticeInheritance {
    public static void main(String[] args) {
        SavingAccount a1 = new SavingAccount(1234143242141238l, "Smith", "12/03/1995","This is address",9876543210l);
        a1.setBalance(1000000);
        a1.deposite(10000);
        a1.withdraw(10000);
        a1.fixedDeposite(50000);
        a1.liquidateFd();
        a1.close();
        a1.balance = 40000;
    }

}
