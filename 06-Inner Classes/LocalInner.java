import java.lang.*;
import java.util.*;

class Outer{
    void display(){
        class Inner{    // local inner class can be made abstract or final
            void innerDisplay(){
                System.out.println("Local Inner Display");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}

class LocalInner{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}