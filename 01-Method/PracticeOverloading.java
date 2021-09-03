import java.util.*;
import java.lang.*;

class PracticeOverloading {
    int reverse(int a) {
        int rev = 0;
        while (a > 0) {
            rev = rev * 10 + a % 10;
            a /= 10;
        }
        return rev;
    }

    int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        return B;
    }

    boolean validate(String name,String age){
        return (name.matches("[a-zA-Z\\s]+") && age.matches("\\d+"));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PracticeOverloading p = new PracticeOverloading();
        System.out.print("Enter the number to reverse :");
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " is: " + p.reverse(num));
        int A[] = { 12, 43, 95, 71, 8 };
        int rev[] = p.reverse(A);
        System.out.print("Reverse of array is: ");
        for (int x : rev) {
            System.out.printf("%-4d", x);
        }
        System.out.println("");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        String age = sc.next();
        System.out.println("Varification of name and age is: " + p.validate(name, age));
        sc.close();
    }
}