import java.lang.*;
import java.util.*;

class Student {
    private String rollNo;
    private String name;
    private String branch;

    private static int count = 1;

    private String generateRollNo() {
        Date d = new Date();
        String rn = "univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }

    Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
        rollNo = generateRollNo();      //automatically generate rollNo and assigns it
    }

    void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Roll number: " + rollNo);
    }
}

class StaticChallenge {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", "Cse");
        Student s2 = new Student("Laxman", "Cse");
        s1.studentDetails();
        s2.studentDetails();
    }
}