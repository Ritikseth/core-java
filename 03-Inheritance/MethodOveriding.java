import java.lang.*;
import java.util.*;

class Super {
    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    @java.lang.Override
    public void display() {
        System.out.println("Sub Class Display");
    }
}

class MethodOveriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();
        Sub sb = new Sub();
        sb.display();
        Super su = new Sub();
        su.display(); // When a super class reference holding the object of sub class and
                      // overridden method is called then method of object will be called it is
                      // Dynamic Method Dispatch
    }
}
