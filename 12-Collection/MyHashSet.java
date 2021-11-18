// This class offers constant time performance for the basic operations( add, remove, contains and size).
import java.util.*;
import java.lang.*;

class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20,0.25f);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);
    }    
}

/* declaration and initialization :-
1. HashSet()
2. HashSet(int initialCapacity)
3. HashSet(int initialCapacity,float loadFactor)
4. HashSet(Collection<? extgends E> c)

1. Initial capacity defines the initial size of the HashSet. default being 16
2. Loading factor definees how much the table should be filled before it is resized.
Best being 50% of the initial capacity. i.e. 0.5, default is 0.75
*/

