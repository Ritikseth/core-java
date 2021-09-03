import java.lang.*;

class method_overloading{
    static int max(int a, int b){
        return a > b ? a : b;
    }
    static int max(int a, int b, int c){
        return a>b&& a>c? a:(b>c?b:c);
    }
    static float max(float a, float b){    // float method can also be used for int variables,they both have int as literal
        return a > b?a:b;
    }
    static double max(double a, double b){
        return a > b?a:b;
    }
    public static void main(String[] args){
        System.out.println(max(10,15));
        System.out.println(max(5f,7f));
        System.out.println(max(5,20,15));
        System.out.println(max(5.6,10.8));
    }
}