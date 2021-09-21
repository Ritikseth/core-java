import java.lang.*;
import java.util.*;
import java.io.*;

class LowBalanceException extends Exception {
    public String toString(){
        return "Balance should not be less than 5000";
    }
}

class CheckedUnchecked{
    static void fun1(){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    static void fun2(){
        fun1();
        FileInputStream f= new FileInputStream("My.txt");
    }
    static void fun3(){
        fun2();
        try {
            throw new LowBalanceException();
        }
        catch (LowBalanceException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        fun3();
    }
}