import java.util.*;
// linkedhashmap has key, value pair while linkedhashset has only value
// Just like linkedhashmap,it also stores prev and next which makes it different from hashset

class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");

        Iterator<String> itr =lhs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // lhs.forEach(System.out::println);
    }    
}
