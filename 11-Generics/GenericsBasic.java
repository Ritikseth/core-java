import java.util.*;
import java.lang.*;

/* class ObjectClass{
    Object obj = new String("Hello"); // If we have an object of ObjectClass then we can assign it to any class
    //obj = new Integer(10);      
    String str = (String) obj;      // we will have to do type casting to assign it to actual reference of the object
    // but we cannot assign an integer reference to string, line-7 will result in an error
    
    Object obj1[]= new Object[3];
    obj1[0]="hi";
    obj1[1]="bye";
    // obj1[2]=10;

    String str1;
    for(int i=0; i<3; i++) {
        str1=(String)obj1[i];
        System.out.println(str1);
    }
} */

class Generics<T> {
    T data[] = (T[])new Object[3];

        GenericsBasic<String> g = new GenericsBasic(); // only String can be assigned to the reference
        g.data[0]  ="hi";
        g.data[1]  ="bye";
        // g.data[2]  =10;
        String  str = g.data[0]; // type casting in also not required
}

class GenericsBasic{
    public static void main(String[] args) {
        
    }

}
