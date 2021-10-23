import java.lang.*;
import java.util.*;

enum Dept{
    CS("John", "Block A"),ISE("Smith","Block B"),CIVIL("Srinivas", "Block C"),ECE("Dave", "Block D"); // must be in capital letters
    // These are declared as static and final

    String head;
    String location;
    private Dept(String head,String loc){  // constructor must be private or default
        // System.out.println(this.name());
        this.head=head;
        this.location = loc;
    }

    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }
    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
}

class Enum {
    public static void main(String[] args) {
        Dept d = Dept.CIVIL;
        d.display();

        System.out.println(d.ordinal()); // returns the position where enum has been declared
        System.out.println(Dept.valueOf("ISE"));

        Dept []list = Dept.values();

        for(Dept x: list)
            System.out.print(x+", ");
        System.out.println();

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }
}

// When enum is loaded all the identifiers are created which is why when line no.19 is executed the constructor is called 4 times and all 4 identifiers are printed

//If we are giving any values to the identifiers declared in Enum then we must have a parameterized constructor