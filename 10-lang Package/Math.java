import java.lang.*;
import java.util.*;

class Math {
    public static void main(String[] args) {
        System.out.print("Absolute :");
        System.out.println(java.lang.Math.abs(-123));

        System.out.print("Absolute :");
        System.out.println(java.lang.StrictMath.abs(-123)); //Used for more precise result,but slower

        System.out.print("Cube Root :");
        System.out.println(java.lang.Math.cbrt(27));

        System.out.print("Exact Decrement :");
        System.out.println(java.lang.Math.decrementExact(7));  //decrementExact ensures that the decrement has been done
        // System.out.println(java.lang.Math.decrementExact(Integer.MIN_VALUE)); // will give error as overflow operation is happening 
        // for example in below program, after decrementing the value becomes positive after underflow
        int i = Integer.MIN_VALUE;
        i--;
        System.out.println(i);

        System.out.print("Exponent value in Floating Point Rep. :");
        System.out.println(java.lang.Math.getExponent(123.45));

        System.out.print("Round Division :");
        System.out.println(java.lang.Math.floorDiv(50, 9));

        System.out.print("e power x :");
        System.out.println(java.lang.Math.exp(1));

        System.out.print("e power x :");
        System.out.println(java.lang.StrictMath.exp(1));

        System.out.print("Log base 10 :");
        System.out.println(java.lang.Math.log10(100));

        System.out.print("Maximum :");
        System.out.println(java.lang.Math.max(100, 50));

        System.out.print("Tan :");
        System.out.println(java.lang.Math.tan(45 * java.lang.Math.PI / 180));

        System.out.print("Convert to Radians :");
        System.out.println(java.lang.Math.toRadians(90));

        System.out.print("Convert to Degree :");
        System.out.println(java.lang.Math.toDegrees(java.lang.Math.atan(1)));

        System.out.print("Convert To Degree :");
        System.out.println(java.lang.StrictMath.toDegrees(java.lang.StrictMath.tanh(1)));

        System.out.print("Random :");
        System.out.println(java.lang.Math.random() * 1000); // generates a random number between 0 and 1000

        System.out.print("Power :");
        System.out.println(java.lang.Math.pow(2, 3));

        System.out.print("Excact Product :");
        System.out.println(java.lang.Math.multiplyExact(100, 200)); // Will give exact multiplication and avoids underflown or overflown results

        System.out.print("Next Float Value :");
        System.out.println(java.lang.Math.nextAfter(12.5, 11)); // returns next floating number when moving towards 11

    }
}