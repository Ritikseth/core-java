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