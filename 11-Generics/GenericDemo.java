import java.util.*;
import java.lang.*;

class Data<T>{
    private T obj;

    public void setData(T v) {
        this.obj = v;
    }
    public T getData() {
        return obj;
    }
}

@SuppressWarnings("unchecked") // to ignore warnings while casting an object to generic type
class MyArray<T>{
    T A[] =(T[])new Object[10]; //we cannot create an array of type generic, therefore create array of object then type cast it to generic 
    int length=0;
    
    void append(T v) {
        A[length++] = v;
    }
    void display(){
        for(int i=0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}

class GenericDemo{
    public static void main(String[] args) {
        Data<Integer> d =new Data<>();
        //d.setData(new Integer(10));  
        d.setData(10);      //autoboxing can be done here
        System.out.println(d.getData());

        MyArray<String> m = new MyArray<>();
        m.append("Hello");
        m.append("My");
        m.append("name");
        m.append("is");
        m.append("Alice");
        m.display();
    }
}

/* Note:-
1. If we don't mention any type while creating a generic instance then it will be taken as an object by default
2. Multiple parameters can be given, example-
class MyArray<T,K>{}
MyArray<String,Integer> m =new MyArray<>();
3. Subtypes, If we extend a class MyArray2 from MyArray, then it will be taken as an object by default unless we specify.
class MyArray<T>{}
a. class MyArray2 extend MyArray // for object
b. class MyArray2 extend MyArray<String> // for String
c. class MyArray2<T> extends MyArray<T> // for generic, and we will have to mention the type while creating an instance
4. Bounded Types
class MyArray<T extends Number>{} // now only data types(only one) that are extended from Numbers can be passed , for example int, float,double,etc

class A{}
class B extends A{}
class MyArray<T extends A>{}
MyArray <A> m = new MyArray<>();
MyArray <B> m2 = new MyArray<>();

5. Even if we have interface class A{}, we will have to extend it and not implement it
*/