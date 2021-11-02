import java.util.*;
import java.lang.*;

class ListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        ArrayList<Integer> list2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        list.add(10);
        list.add(0, 5);
        list.addAll(list2); // list.addAll(1,list2); with index

        System.out.println("List: " + list);
        System.out.println(list.contains(25));
        System.out.println(list.get(5));
        System.out.println(list.indexOf(70));
        System.out.println(list.lastIndexOf(70));
        System.out.println(list.set(6, 100));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer x : list) {
            System.out.println(x);
        }

        Iterator<Integer> it = list.iterator(); // only allows forward iteration

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Iterator<Integer> it1 = list.iterator(); it1.hasNext();) {
            System.out.println(it1.next());
        }
        list.forEach(n -> System.out.println(n));

        ListIterator<Integer> lit = list.listIterator(); // allows both forward and backward iteration
        lit.next();
        System.out.println(lit.nextIndex());
        System.out.println("List size: " + list.size());
        /*
         * System.out.println("List isEmpty: " + list.isEmpty());
         * System.out.println("List capacity: " + list.capacity());
         * System.out.println("List contains: " + list.contains("A"));
         * System.out.println("List indexOf: " + list.indexOf("A"));
         * System.out.println("List lastIndexOf: " + list.lastIndexOf("A"));
         * System.out.println("List get: " + list.get(0));
         * System.out.println("List set: " + list.set(0, "a"));
         * System.out.println("List remove: " + list.remove("a"));
         * System.out.println("List remove: " + list.remove(0));
         * System.out.println("List remove: " + list.remove("A"));
         * System.out.println("List remove: " + list.remove(0)); }
         */
    }
}