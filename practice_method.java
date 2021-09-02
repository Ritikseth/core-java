import java.util.*;
import java.lang.*;
import java.lang.Math;

class practice_method{
    static boolean isprime(int n){
        for(int i = 2; i <(int)Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        System.out.println(isprime(num));
        s.close();
    }
}