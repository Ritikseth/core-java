import java.lang.*;
import java.util.*;

interface Test1 {
    final static int x = 10; // int x = 10;
                             // any variable declared in an interface is by default final and static
    void meth1();
    void meth2();

    public static void meth3() { // An interface can have only static type concrete method
        System.out.println("Meth3 of Test");
    }
}

class Test2 implements Test1 {
    public void meth1() {
        System.out.println("Test2 Meth1");
    }

    public void meth2() {
        System.out.println("Test2 Meth2");
    }

    public void meth4() {
        System.out.println("Test2 Meth4");
    }
}

class InterfaceBasic {
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        t1.meth1();
        t1.meth2();
        // t1.meth4(); //meth4 cannot be called, cause t1 is a reference of Test1 and
        // doesn't know about meth3
        System.out.println(Test1.x);
        Test1.meth3(); // static method can be called without making any object
    }
}