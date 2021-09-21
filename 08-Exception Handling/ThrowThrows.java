import java.lang.*;
import java.util.*;

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimension of Rectangle cannot be negative";
    }
}

class ThrowThrows {
    static int area(int x, int y) throws NegativeDimensionException {
        if (x < 0 || y < 0)
            throw new NegativeDimensionException();
        return x * y;
    }

    static void meth2() throws NegativeDimensionException {
        
        System.out.println("Area is: " + area(-10, 5));
    }

    public static void main(String[] args) {
        try {
            meth2();
        }
         catch (NegativeDimensionException e) {
            System.out.println(e.toString());
        }
    }
}