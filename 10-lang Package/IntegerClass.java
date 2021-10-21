import java.lang.*;
import java.util.*;

class IntegerClass{
    public static void main(String[] args) {
        int m1=15;

        Integer m2=m1;
        Integer m3=15;
        System.out.println(m2.equals(m1));
        System.out.println(m3.equals(m1));

        Integer m4=Integer.valueOf("123");
        Integer m5=Integer.valueOf("1010",2);  //Giving a radix(base)
        Integer m6=Integer.valueOf(12);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);

        Integer m7=Integer.decode("0xA7");  // similar to radix
        System.out.println(m7);

        System.out.println(Integer.parseInt("1234"));
        System.out.println(Integer.reverse(567));
        System.out.println(Integer.reverseBytes(12));
        System.out.println(Integer.toBinaryString(10));
    }
}