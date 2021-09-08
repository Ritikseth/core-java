import java.lang.*;
import java.util.*;

class Outer{
    static int x= 10;
    int y =20;

    static class Inner{
        void display(){
            System.out.println(x);
            // System.out.println(y);
            // not allowed, static inner class can only access the static members of outer class
        }
    }
}

class StaticInner {
    public static void main(String[] args){
        Outer.Inner oi = new Outer.Inner();
        oi.display();
    }    
}

/* Difference between Nested inner class and static inner class is,
In static inner class we can create object of inner class without creating object of outer class */