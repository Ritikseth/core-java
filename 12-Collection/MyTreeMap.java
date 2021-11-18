import java.util.*; // for TreeMap
import java.util.Map.*; // for Entry class

//HashMap take O(1) time for get and put
//TreeMap take O(logN) time for get and put

class MyTreeMap{
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        tm.put(4,"E");
        tm.put(6,"G");

        Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getKey() + " : " + e.getValue());
        System.out.println(tm.ceilingEntry(5).getValue()); // if 5 is not available,return next higher value
        System.out.println(tm.floorEntry(5).getValue()); // if 5 is not available,return next lower value
        System.out.println(tm.get(3)); // get value by key
        System.out.println(tm);
        
        HashMap<Integer,String> hm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        hm.put(4,"E");
        hm.put(6,"G");
        System.out.println(hm);
    }
}





/* Constructor and Description
1. TreeMap()
Constructs a new, empty tree map, using the natural ordering of its keys.
2. TreeMap(Comparator<? super K> comparator)
Constructs a new, empty tree map, ordered according to the given comparator.
3. TreeMap(Map<? extends K,? extends V> m)
Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.
4. TreeMap(SortedMap<K,? extends V> m)
Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map. */