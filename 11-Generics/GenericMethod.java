import java.lang.*;
import java.util.*;

class GenericMethod{

    static <E>void show(E[] list){
        for(E x: list){
            System.out.println(x);
        }
    }
    static <E>void show1(E... list){
        for(E x: list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"Hi","Hello","Hey"});
        show(new Integer[]{10,20,30,40});
        show1("Hi","Hello","Hey");
        show1(10,20,30,40);
    }
}