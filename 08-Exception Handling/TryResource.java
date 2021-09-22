import java.util.*;
import java.io.*;

class TryResource {

    static void Divide() throws Exception {
        try(FileInputStream fi = new FileInputStream("D:/Java/Test.txt"); Scanner sc = new Scanner(fi)){
        //Test.txt contains 50 40 0 30 10 

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a/c);
        }
    }
    public static void main(String[] args) throws Exception {
        try{
        Divide();
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        // int x = sc.nextInt();
        // System.out.println(x);
    }
}