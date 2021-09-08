import java.lang.*;
import java.util.*;

abstract class My{
    abstract public void show();
}

class Outer{
    public void meth(){
        My m = new My(){
            public void show(){
                System.out.println("Hello");
            }
        };
        m.show();
        // or below code can also be used
        
        /* new My(){
            public void show(){
                System.out.println("Hello");
            }
        }.show(); */
    }
}

class anonymousInner {
    public static void main(String[] args){
        Outer o = new Outer();
        o.meth();
    }
}

// Here we have an abstract class 'My' so we cannot create its object but we can have its reference

// In Outer class we are implementing 'My' internally as a concrete class without any name given
// to it, hence known as anonymous inner class
