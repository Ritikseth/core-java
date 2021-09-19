import java.util.*;
import java.lang.*;

class ExceptionBasic {
    public static void main(String[] args) {

        try {
            int[] A = { 1, 0, 5, 6, 3 };
            int r;
            r = A[0] / A[1];
            System.out.println(A[10]);
            System.out.println(r);
            
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally{ //always executed
            System.out.println("Completion of program");
        }
    }
}