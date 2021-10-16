import java.util.*;
import java.lang.*;

//Deep Cloning
class Address implements Cloneable {
    int pinCode;
    String city;

    Address() {
    }

    Address(int pinCode, String city) {
        this.pinCode = pinCode;
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    int rollNo;
    String name;
    Address address = new Address();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student object1 = new Student();
        object1.name = "Ravi";
        object1.rollNo = 1;
        object1.address = new Address(101, "CHD");

        Student object2 = (Student) object1.clone();

        object2.name = "Ram";
        object2.rollNo = 2;
        object2.address = (Address) object1.address.clone();
        object2.address.city = "KUK";
        object2.address.pinCode = 505;

        System.out.println("Printing values from Object1:");
        System.out.println("Name:" + object1.name + " RollNo:" + object1.rollNo);
        System.out.println("Address:" + object1.address.pinCode + " and " + object1.address.city);
        System.out.println("Printing values from Object2:");
        System.out.println("Name:" + object2.name + " RollNo:" + object2.rollNo);
        System.out.println("Address:" + object2.address.pinCode + " and " + object2.address.city);
    }
}