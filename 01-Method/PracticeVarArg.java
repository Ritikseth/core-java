import java.lang.*;
import java.util.*;
class PracticeVarArg {
    static int max(int ...A){
        if(A.length ==0)
            return Integer.MIN_VALUE;
        int m=A[0];
        for(int i=0;i<A.length;i++){
            if(m<A[i])
                m=A[i];
        }
        return m;
    }
    static int sum(int ...A){
        int sum=0;
        for(int x:A)
            sum+=x;
        return sum;
    }
    static double discount(int ...P){
        int sum= sum(P);
        System.out.println("Amount of items purchased = "+sum);
        if(sum<500)
            return sum/10;
        else if(sum<1000)
            return sum/15;
        else if(sum<2000)
            return sum/20;
        else
            return sum/25;
    }
    public static void main(String ...args){
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));
        System.out.println("Sum is: "+sum(10,20,30,40,50));
        System.out.println("Discount is: "+discount(100,156,750,200));
    }
}
