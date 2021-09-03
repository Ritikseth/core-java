import java.util.*;
import java.lang.*;
import java.lang.Math;

class practice_method {
    static boolean isprime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int gcd(int num1, int num2) {
        if (num1 == 0)
            return num2;
        if (num2 == 0)
            return num1;
        if (num1 == num2) // base case
            return num1;
        if (num1 > num2) // a is greater
            return gcd(num1 - num2, num2);
        return gcd(num1, num2 - num1);
    }

    static int max(int A[]) {
        int max = A[0];
        for (int x : A) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("1. To check for prime\n2. To find GCD\n3.Find max element in an array\n4. To Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            n = s.nextInt();
            switch (n) {
                case 1:
                    int num;
                    System.out.print("Enter the number: ");
                    num = s.nextInt();
                    if (isprime(num))
                        System.out.println("The given is prime");
                    else
                        System.out.println("Not a prime number");
                    break;
                case 2:
                    int num1, num2;
                    System.out.print("Enter the numbers : ");
                    num1 = s.nextInt();
                    num2 = s.nextInt();
                    num = gcd(num1, num2);
                    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + num);
                    break;
                case 3:
                    int A[] = new int[5];
                    System.out.print("Enter the numbers: ");
                    for (int i = 0; i < 5; i++)
                        A[i] = s.nextInt();
                    System.out.println("Max element is: "+max(A));
                    break;
                case 4:
                    s.close();
                    System.exit(1);
                default:
                    System.out.println("Please give a valid input");
            }
        }
    }
}