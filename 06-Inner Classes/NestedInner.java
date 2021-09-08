import java.lang.*;
import java.util.*;

class Outer{
    int x= 10;
    class Inner{
        int y= 20;
        void innerDisplay() {
            System.out.println("x= "+x+" y= "+y);
            // identifier of the outer class can be directly accessed in the inner class
        }
    }
    void outerDisplay(){
        Inner i = new Inner();
        System.out.println("x= "+x+" y= "+i.y);
         //inner object is needed to access the inner class identifier

        i.innerDisplay();
    }
}

class NestedInner {
    public static void main(String[] args){
        Outer o = new Outer();
        o.outerDisplay();
        // Outer.Inner oi = new Outer().new Inner();
        // Above line can be used to create object of Inner class
    }
}
