import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true){ 
            // 5 is the default initial capacity, .75f is the default load factor, true is the default access order
            //If true is not passed as the third parameter, then everything is done according to the order of insertion
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;  // remove the eldest(LRU) entry if size is greater than 5
            }
        };
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");

        lhm.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
