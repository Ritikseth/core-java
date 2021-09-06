import java.lang.*;
import java.util.*;

abstract class Super {
    public Super() {
        System.out.println("Super constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();
}

class Sub extends Super {
    @java.lang.Override
    public void meth2() {
        System.out.println("Sub meth2");
    }
}

class AbstractBasic {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}