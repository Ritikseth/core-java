import java.util.*;

class My implements Comparator<Integer> {
    public int compare(Integer a, Integer b) { // This comparator will sort the array in descending order
        if (a < b)
            return 1; // default is -1(when we donot define our know comparator)
        else if (a > b)
            return -1;
        else
            return 0;
    }

}

class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 6, 8, 1, 3, 5, 7 };
        int b[] = { 2, 4, 5, 6, 8, 1, 3, 5, 7 };

        System.out.println(Arrays.compare(a, b));
        int c[] = Arrays.copyOf(a, 4); // copy till length 4
        for (int x : c)
            System.out.println(x);
        Arrays.fill(c, 10); // used to fill the array with a constant value for all index
        for (int x : c)
            System.out.println(x);

        c = Arrays.copyOf(a, a.length);
        Arrays.sort(c);
        for (int x : c)
            System.out.println(x);
        // as the array c is now sorted, we can perform binary search on
        // it to find the index of the element we are looking for
        System.out.println("Index of 5 is: " + Arrays.binarySearch(c, 5));

        Integer d[] = { 2, 4, 5, 6, 8, 1, 3, 5, 7 };
        Arrays.sort(d, new My());
        System.out.println("Sort using our own comparator: ");
        for (int x : d)
            System.out.println(x);
    }
}