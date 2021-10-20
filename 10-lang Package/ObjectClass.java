import java.lang.*;
import java.util.*;

class MyObject{
    public String toString(){
        return "My object";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
    // public void wait(){
    // }
    // We cannot override wait(),notify(),..other methods that are final
}

class ObjectClass {
    public static void main(String[] args) {
        Object o1 =new Object();
        Object o2 =new Object();
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        MyObject m = new MyObject(); // any class(even user defined) is inherited from the object class
        //Hence when using dot operator on "m" we can use all the methods from Object class itself
        System.out.println(m);
        MyObject m1 = new MyObject();
        MyObject m2 = new MyObject();
        System.out.println(m1.equals(m2));
    }
}
